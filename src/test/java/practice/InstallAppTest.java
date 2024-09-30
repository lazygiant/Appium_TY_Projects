package practice;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class InstallAppTest {

	@Test
	public void installApp() throws MalformedURLException   {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("automationName", "uiAutomator2");
		dc.setCapability("UDID", "79da6ca0");
		dc.setCapability("noReset", true);
		dc.setCapability("ignoreHiddenApiPolicyError", true);
		dc.setCapability("autoGrantPermission", true);
		
		dc.setCapability("app", "C:\\Users\\User\\OneDrive\\Desktop\\Appium\\apk files\\ApiDemos-debug.apk");
		
//		dc.setCapability("appPackage", "io.appium.android.apis");
//		dc.setCapability("appActivity", ".ApiDemos");
		
		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u,dc);
		
		WebElement element = driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
		
		((JavascriptExecutor)driver).executeScript("mobile: doubleClickGesture",
		ImmutableMap.of("elementId",((RemoteWebElement)element).getId(),
		"duration",2000));
	}
}
