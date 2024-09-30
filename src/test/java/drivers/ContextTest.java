package drivers;

import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ContextTest {

	@Test
	public void switchContext() throws Throwable {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("automationName","uiAutomator2");
		dc.setCapability("deviceName", "OPPOF19s");
		dc.setCapability("UDID", "79da6ca0");
		dc.setCapability("noReset", true);
		dc.setCapability("ignoreHiddenApiPolicyError", true);
		dc.setCapability("autoGrantPermission", true);
		
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".MainActivity");
		
		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u,dc);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("abcd");
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/..//android.widget.TextView[@text='ADD TO CART']")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed")).click();
		
		Thread.sleep(3000);
		
		Set<String> contextHandles = driver.getContextHandles();
		int count = contextHandles.size();
		System.out.println(count);
		for (String ch : contextHandles) {
			System.out.println(ch);
			if (ch.contains("WEBVIEW_")) {
				driver.context(ch);
			}
			driver.context("WEBVIEW_com.androidsample.generalstore");
		}
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("appium");
}
}
