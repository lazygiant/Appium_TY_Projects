package com.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.GestureUtility;
import io.appium.java_client.android.AndroidDriver;

public class SearchPage {

	AndroidDriver driver;
	
	public SearchPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(id = "com.hm.goe:id/action_search_button")
	private WebElement search;
	
	@FindBy(className = "android.widget.ScrollView")
	private WebElement close;
	
	@FindBy(id = "com.hm.goe:id/searchEditText")
	private WebElement searchBar;
	
	@FindBy(xpath = "(//android.widget.LinearLayout[@resource-id='com.hm.goe:id/element1']/..//android.widget.TextView[contains(@text,'T-shirt')])[1]")
	private WebElement product;
	
	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getProduct() {
		return product;
	}

	public void search(GestureUtility gutil, String key) {
		
		search.click();
		close.click();
		searchBar.sendKeys(key);
		gutil.searchAction();
		String result = product.getText();
		if (result.contains(key)) {
			System.out.println(key+" is present in "+result);
		}
		else {
			System.out.println(key+" is not present in "+result);
		}
	}
}
