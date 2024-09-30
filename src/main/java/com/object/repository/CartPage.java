package com.object.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CartPage {

	AndroidDriver driver;
	
	public CartPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(id = "com.androidsample.generalstore:id/appbar_btn_back")
	private WebElement backBtn;
	
	@FindBy(className =  "android.widget.CheckBox")
	private WebElement checkBox;
	
	@FindBy(id = "com.androidsample.generalstore:id/btnProceed")
	private WebElement visitWebsiteBtn;
	
	public WebElement getBackBtn() {
		return backBtn;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getVisitWebsiteBtn() {
		return visitWebsiteBtn;
	}
	
	
}
