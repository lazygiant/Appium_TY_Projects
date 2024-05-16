package TestScripts;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class FavouriteTest extends BaseClass
{
 @Test
 public void favourite()
 {
 
 gutil.scrollToText("Tops");
 pcp.clickonTrouser();
 pp.cartandfav();
 cp.cart();
 cp.movetofav();
 np.clickonBackbtn();
 pcp.clickOnMyfov();
 vp.verifyfavourite("Flared leggings");
 
 }
}
