package com.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;

public class VerificationPage 
{
	AndroidDriver driver;
	
  @FindBy(xpath="//android.widget.ImageView[@content-desc='Remove']/preceding-sibling::android.widget.TextView[1]")
  private WebElement product;
  
  @FindBy(xpath="//android.widget.ImageView[@content-desc='Remove from favourites']/following-sibling::android.widget.TextView[@resource-id='com.hm.goe:id/articleName']")
  private WebElement fovProduct;
  
  public WebElement getFovProduct() {
	return fovProduct;
}

public VerificationPage(AndroidDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }

public WebElement getProduct() {
	return product;
}
  
  public void verify(String Expected)
  
  {
	  String Actual=product.getText();
	  Assert.assertEquals(Actual, Expected);
  }
  public void verifyfavourite(String expected)
  {
	  String actual=fovProduct.getText();
	  Assert.assertEquals(actual, expected);
  }
}
