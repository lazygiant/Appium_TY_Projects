package com.objectRepo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtilities.GestureUtility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SustainabilityPage {

	AndroidDriver driver;
	
	public SustainabilityPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(xpath = "(//android.widget.ImageButton)[1]")
	private WebElement option;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Sustainability']")
	private WebElement sustain;
	
	@FindBy(id = "com.hm.goe:id/editorialTextHeadline")
	private List<WebElement> heading;
	
	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getOption() {
		return option;
	}

	public WebElement getSustain() {
		return sustain;
	}

	public List<WebElement> getHeading() {
		return heading;
	}

	public void sustainability(GestureUtility gutil) {
		option.click();
		sustain.click();
		int count=0;
		
//		for (WebElement head : heading) {
////			//gutil.scrollByCordinates(2221, 547, 901,547, direction, 3.0);
////			//gutil.scrollByCordinates(547, 2221, 547, 901, "up", 3.0);
//			gutil.scrollToText("Let's take care");
//			System.out.println(head.getText());
//		}
		//gutil.scrollToText("Let's take care");
		//gutil.scrollToId("com.hm.goe:id/editorialTextHeadline");
		for(int i=0;i<count;i++) {
			gutil.scrollToId("com.hm.goe:id/editorialTextHeadline");
			String head = heading.get(i).getText();
			System.out.println(head);
			count=heading.size();
			count++;
			System.out.println(count);
			//count=driver.findElements(AppiumBy.id("com.hm.goe:id/editorialTextHeadline"));
		}
	}
}
