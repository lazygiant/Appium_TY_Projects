package com.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CartPage {

	AndroidDriver driver;
	
	@FindBy(xpath="//android.widget.TextView[@text='S']")
	private WebElement size;
	
	@FindBy(xpath="//android.widget.TextView[@text='Add']")
	private WebElement addBtn;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.hm.goe:id/hm_shoppingbag_count']")
	private WebElement bag;
	
	@FindBy(xpath="//android.widget.ImageView[@content-desc='Move to Favourites']")
	private WebElement movetoFavorites;
	
	
	public CartPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	public WebElement getSize() {
		return size;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement getBag() {
		return bag;
	}

	public WebElement getMovetoFavorites() {
		return movetoFavorites;
	}

	public void cart() {
		size.click();
		addBtn.click();
		bag.click();
	}
	public void movetofav()
	{
		movetoFavorites.click();
	}
}
