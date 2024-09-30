package com.object.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProductsPage {

	AndroidDriver driver;
	
	public ProductsPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		 
	}
	
	@FindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
	private WebElement cartBtn;
	
	@FindBy(id = "com.androidsample.generalstore:id/appbar_btn_back")
	private WebElement backBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Air Jordan 4 Retro']/..//android.widget.TextView[@text='ADD TO CART']")
	private WebElement shoe1;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Air Jordan 1 Mid SE']/..//android.widget.TextView[@text='ADD TO CART']")
	private WebElement shoe2;

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public void setCartBtn(WebElement cartBtn) {
		this.cartBtn = cartBtn;
	}

	public WebElement getBackBtn() {
		return backBtn;
	}

	public void setBackBtn(WebElement backBtn) {
		this.backBtn = backBtn;
	}

	public WebElement getShoe1() {
		return shoe1;
	}

	public void setShoe1(WebElement shoe1) {
		this.shoe1 = shoe1;
	}

	public WebElement getShoe2() {
		return shoe2;
	}

	public void setShoe2(WebElement shoe2) {
		this.shoe2 = shoe2;
	}
	
}
