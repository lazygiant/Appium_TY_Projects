package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import io.appium.java_client.AppiumBy;

public class FavouriteTest extends BaseClass
{
 @Test
 public void favourite()
 {
//	 driver.findElement(AppiumBy.androidUIAutomator
//				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Retro camp rewind ❤️\"));"));	 
//	 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Trousers']")).click();
// driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id='com.hm.goe:id/element1'])[2]")).click();
// driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc='pdp_add_to_bag_new']")).click();
// driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='S']")).click();
// driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add']")).click();
// driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.hm.goe:id/hm_shoppingbag_count']")).click();
// driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc='Move to Favourites']")).click();
// driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc='Back']")).click();
// driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc='Navigate up']")).click();
// driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc='My Favourites']")).click();
 
 
 gutil.scrollToText("Tops");
 pcp.clickonTrouser();
 pp.cartandfav();
 cp.cart();
 cp.movetofav();
 np.clickonBackbtn();
 pcp.clickOnMyfov();
 String actual = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='High-waisted joggers']")).getText();
 String expected="High-waisted joggers";
 System.out.println(actual);
 Assert.assertEquals(actual, expected);
 
 }
}
