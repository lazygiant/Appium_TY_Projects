package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import io.appium.java_client.AppiumBy;

public class CartTest extends BaseClass
{
  @Test
  public void cart()
  {
	  driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Retro camp rewind ❤️\"));")).click();
      driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Tops']")).click(); 
   driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id='com.hm.goe:id/element1'])[1]")).click();
   driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc='pdp_add_to_bag_new']")).click();
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='S']")).click();
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add']")).click();
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.hm.goe:id/hm_shoppingbag_count']")).click();
    String actul = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Rhinestone-strap body']")).getText();
    String Expected="Rhinestone-strap body";
    Assert.assertEquals(actul, Expected);
  
  }
}
