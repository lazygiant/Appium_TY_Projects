package TestScripts;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import io.appium.java_client.AppiumBy;

public class ChatboxTest extends BaseClass
{
  @Test
  public void chat() throws Throwable
  {
	  driver.findElement(AppiumBy.xpath("(//android.widget.ImageButton[@index='0'])[1]")).click();
	  driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Customer Service\"));")).click();
	  driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Contact']")).click();
	  Thread.sleep(3000);
	  //driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='Nuance-chat-anchored']")).click();
//	  driver.executeScript("mobile: clickGesture", ImmutableMap.of(
//				"x", 901,
//				"y", 2211
//				));
		
	  driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id='main-content']/following-sibling::android.view.View[@resource-id='nuanMessagingFrame']//android.widget.Button[@text='CHAT NOW']")).click();
	  
  }
}
