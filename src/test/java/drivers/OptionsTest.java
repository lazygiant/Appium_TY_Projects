package drivers;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class OptionsTest {

	@Test
	public void optionsClass() throws MalformedURLException {
		
		File f = new File
		("C:\\Users\\User\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		
		AppiumDriverLocalService service = new AppiumServiceBuilder().
		withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).
		withTimeout(Duration.ofSeconds(300)).build();
		
		service.start();
		
		UiAutomator2Options op = new UiAutomator2Options();
		op.setPlatformName("Android");
		op.setAutomationName("uiAutomator2");
		op.setAutoGrantPermissions(true);
		op.setNoReset(true);
		op.setIgnoreHiddenApiPolicyError(true);
		
		op.setAppPackage("io.appium.android.apis");
		op.setAppActivity(".ApiDemos");
		
		URL u = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(u,op);
		
		service.stop();
	}
}
