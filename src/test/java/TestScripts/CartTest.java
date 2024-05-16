package TestScripts;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class CartTest extends BaseClass
{
  @Test
  public void cartmoduletest()
  {
    gutil.scrollToText("Tops");
    pcp.clickOnTops();
    pp.addtocart();
    cp.cart();
    vp.verify("Rib-knit collared top"); 
  }
}
