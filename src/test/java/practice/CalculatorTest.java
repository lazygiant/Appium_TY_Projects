package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorTest {

	@Test
	public void calculator() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("automationName", "uiAutomator2");
		dc.setCapability("UDID", "79da6ca0");
		dc.setCapability("noReset", true);
		dc.setCapability("ignoreHiddenApiPolicyError", true);
		dc.setCapability("autoGrantPermission", true);
		
		dc.setCapability("appPackage", "com.coloros.calculator");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u,dc);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.id("com.coloros.calculator:id/formula")).clear();

		driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_9")).click();
		driver.findElement(AppiumBy.id("com.coloros.calculator:id/img_op_mul")).click();
		driver.findElement(AppiumBy.id("com.coloros.calculator:id/digit_9")).click();
		
		String ip = driver.findElement(AppiumBy.id("com.coloros.calculator:id/formula")).getText();
		String res = driver.findElement(AppiumBy.id("com.coloros.calculator:id/result")).getText();
		System.out.println("input "+ip+" = "+"result "+res);
		
	}
}
