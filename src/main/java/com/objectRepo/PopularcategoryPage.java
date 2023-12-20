package com.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PopularcategoryPage 
{
	AndroidDriver driver;
  @FindBy(xpath="//android.widget.TextView[@text='Tops']")
  private WebElement tops;
  
  @FindBy(xpath="//android.widget.TextView[@text='Trousers']")
  private WebElement trousers;
  
  @FindBy(xpath="//android.widget.Button[@content-desc='My Favourites']")
  private WebElement myfovrite;
  
  public PopularcategoryPage(AndroidDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }

public WebElement getTops() {
	return tops;
}

public WebElement getTrousers() {
	return trousers;
}

  public WebElement getMyfovrite() {
	return myfovrite;
}

public void clickOnTops()
  {
	  tops.click();
  }
  public void clickonTrouser()
  {
	  trousers.click();
  }
  public void clickOnMyfov()
  {
	  myfovrite.click();
  }
}
