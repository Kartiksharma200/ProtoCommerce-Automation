package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToCartPage {
	
	WebDriver driver;
	
	@FindBy (xpath = "//a[normalize-space()='Shop']")
	WebElement ShopBtn;
	
	@FindBy (xpath = "//app-card[1]//div[1]//div[2]//button[1]")
	WebElement AddIphone;
	
	@FindBy (xpath = "//a[@class='nav-link btn btn-primary']")
	WebElement CheckOutBtn;
	
	@FindBy (xpath = "//app-card[3]//div[1]//div[2]//button[1]")
	WebElement AddNokiePhone;
	
	@FindBy (xpath = "//a[normalize-space()='iphone X']")
	WebElement VerifyIphoneAdd;
	
	public addToCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnShop() {
		ShopBtn.click();
	}
	
	public void verifyShopSection() {
		String expectedUrl = "https://rahulshettyacademy.com/angularpractice/shop";
		String ActualUrl = driver.getCurrentUrl();
		
		if(ActualUrl.equals(expectedUrl)) {
			System.out.println("<--------Verify Shop Section-------->");
		}else {
			System.out.println("<--------Failed to Verify Shop Section-------->");
		}
	}
	
	public void addToCartIphone() {
		AddIphone.click();
	}
	
	public void addToCartNokie() {
		AddNokiePhone.click();
	}
	
	public void CheckOut() {
		CheckOutBtn.click();	
	}
	
	public void verifyCheckOut() {
		if(VerifyIphoneAdd.isDisplayed()) {
			System.out.println("<---------Add Phone Successfully--------->");
		}else {
			System.out.println("<----------Failed to Verify phone---------->");
		}
	}

}
