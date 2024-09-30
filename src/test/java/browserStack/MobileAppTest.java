package browserStack;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class MobileAppTest {

	public static final String userName = "madhumitha_xHPBLr";
	public static final String accessKey = "FaDkZzr2jDxsAUzyaLMz";
	public static final String url = 
		"https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	@Test
	public void mobileApp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		browserstackOptions.put("projectName", "TekPyramid");
		browserstackOptions.put("buildName", "1.0.0");
		browserstackOptions.put("debug", "true");
		browserstackOptions.put("networkLogs", "true");
		capabilities.setCapability("bstack:options", browserstackOptions);
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("platformVersion", "9.0");
		capabilities.setCapability("deviceName", "Google Pixel 3");
		capabilities.setCapability("app", "bs://12ce9b952a5ba9d9a305922e78f50601f1dbe8f4");
		AndroidDriver driver = new AndroidDriver(new URL(url),capabilities);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("abcd");
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/..//android.widget.TextView[@text='ADD TO CART']")).click();
		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	}

}
