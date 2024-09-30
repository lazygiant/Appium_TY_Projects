package drivers;

import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;

public class DriverTest {

	@Test
	public void drivers() throws MalformedURLException, InterruptedException {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("platformName", "Android");
			dc.setCapability("automationName", "uiAutomator2");
			dc.setCapability("UDID", "79da6ca0");
			dc.setCapability("noReset", true);
			dc.setCapability("ignoreHiddenApiPolicyError", true);
			dc.setCapability("autoGrantPermission", true);
					
//			dc.setCapability("appPackage", "io.appium.android.apis");
//			dc.setCapability("appActivity", ".ApiDemos");
			
			URL u = new URL("http://localhost:4723");
			AndroidDriver driver = new AndroidDriver(u,dc);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
//			String packageName="com.androidsample.generalstore";
			
//			driver.installApp("C:\\Users\\User\\OneDrive\\Desktop\\Appium\\apk files\\General-Store.apk");
//			System.out.println(driver.isAppInstalled(packageName));
			
//			driver.activateApp("io.appium.android.apis");
//			Thread.sleep(5000);
//			System.out.println(driver.currentActivity());
			
//			driver.runAppInBackground(Duration.ofSeconds(5));
//			ApplicationState status = driver.queryAppState(packageName);
//			System.out.println(status);
			
//			driver.openNotifications();
			
//			driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("abc");
//			driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
//			driver.hideKeyboard();
//			driver.pressKey(new KeyEvent(AndroidKey.HOME));
//			driver.removeApp(packageName);
//			System.out.println(driver.isAppInstalled(packageName));
			
//			ScreenOrientation screen = driver.getOrientation();
//			driver.rotate(screen.LANDSCAPE);
			
//			driver.setClipboardText("Welcome to Appium");
//			System.out.println(driver.getClipboardText());
			
////			System.out.println(driver.enableNotificationListener(true));
////			System.out.println(driver.getBatteryInfo());;
////			System.out.println(driver.getCapabilities());;
////			System.out.println(driver.getConnection());;
			
	}
}
