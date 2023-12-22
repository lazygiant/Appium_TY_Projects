package TestScripts;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class CartTest extends BaseClass
{
  @Test
  public void cartmoduletest()
  {
//	  driver.findElement(AppiumBy.androidUIAutomator
//				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Retro camp rewind ❤️\"));")).click();
//      driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Tops']")).click(); 
//   driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@resource-id='com.hm.goe:id/element1'])[1]")).click();
//   driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@content-desc='pdp_add_to_bag_new']")).click();
//    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='S']")).click();
//    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add']")).click();
//    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id='com.hm.goe:id/hm_shoppingbag_count']")).click();
       
    gutil.scrollToText("Tops");
    pcp.clickOnTops();
    pp.addtocart();
    cp.cart();
   vp.verify("Rib-knit collared top");
    
  }
}
