package com.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProductPage 
{
	AndroidDriver driver;
	
  @FindBy(xpath="(//android.widget.LinearLayout[@resource-id='com.hm.goe:id/element1'])[1]")
  private WebElement product1;
  
  @FindBy(xpath="(//android.widget.LinearLayout[@resource-id='com.hm.goe:id/element1'])[2]")
  private WebElement product2;
  
  @FindBy(xpath="//android.widget.FrameLayout[@content-desc='pdp_add_to_bag_new']")
  private WebElement addtobag;
  
  public ProductPage(AndroidDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }

public WebElement getProduct1() {
	return product1;
}

public WebElement getProduct2() {
	return product2;
}

public WebElement getAddtobag() {
	return addtobag;
}
  public void addtocart()
  {
	  product1.click();
	  addtobag.click();
  }
  public void cartandfav()
  {
	  product2.click();
	  addtobag.click();
  }
}
