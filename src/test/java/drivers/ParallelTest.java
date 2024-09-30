package drivers;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ParallelTest {

	@Parameters({"deviceName","UDID","port"})
	@Test
	public void parallel(String deviceName, String UDID, int port) throws MalformedURLException {
		
		File f = new File
		("C:\\Users\\User\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		
		AppiumDriverLocalService service = new AppiumServiceBuilder().
		withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(port).
		withTimeout(Duration.ofSeconds(300)).build();
		
		service.start();
		
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("platformName", "Android");
			dc.setCapability("automationName", "uiAutomator2");
			dc.setCapability("UDID", "");
			dc.setCapability("deviceName", "");
			dc.setCapability("noReset", true);
			dc.setCapability("ignoreHiddenApiPolicyError", true);
			dc.setCapability("autoGrantPermission", true);
					
			dc.setCapability("appPackage", "io.appium.android.apis");
			dc.setCapability("appActivity", ".ApiDemos");
			
			URL u = new URL("http://localhost:"+port+"");
			AndroidDriver driver = new AndroidDriver(u,dc);
			
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		service.stop();
	}
}
