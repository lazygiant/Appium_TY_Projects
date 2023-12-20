package com.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class NavigationPage 
{
  AndroidDriver driver;
  
  @FindBy(xpath="//android.widget.ImageButton[@content-desc='Back']")
  private WebElement backbtn;
  
  @FindBy(xpath="//android.widget.ImageButton[@content-desc='Navigate up']")
  private WebElement navigateup;
  
  public NavigationPage(AndroidDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }

public WebElement getBackbtn() {
	return backbtn;
}

public WebElement getNavigateup() {
	return navigateup;
}
  public void clickonBackbtn()
  {
	  backbtn.click();
	  navigateup.click();
  }
}
