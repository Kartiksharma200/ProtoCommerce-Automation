package com.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageObjects.addToCartPage;
import com.pageObjects.form;
import com.utils.DriverManager;

public class formTest {
		
		private WebDriver driver;
		private form formPage;
		private addToCartPage CartProduct;
		
		@BeforeTest
		public void setup() {
			driver = DriverManager.getDriver();
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			formPage = new form(driver);
			CartProduct = new addToCartPage(driver);
		}
		
		
		@Test
		public void formSubmit() throws InterruptedException {
			formPage.enterName("Kartik");
			formPage.enterEmail("12345@gmail.com");
			formPage.enterPassword("123456");
			formPage.clickCheckBox();
			formPage.ClickTickBox();
			formPage.enterDOB("11062003");
			Thread.sleep(3000);
			formPage.clickOnSubmit();
		}
		
		@Test
		public void addToCartProduct() throws InterruptedException {
			CartProduct.clickOnShop();
			Thread.sleep(3000);
			CartProduct.verifyShopSection();
			CartProduct.addToCartIphone();
			CartProduct.addToCartNokie();
			Thread.sleep(2000);
			CartProduct.CheckOut();
			CartProduct.verifyCheckOut();
			Thread.sleep(2000);
		}
		
		
		@AfterTest
		public void tearDown() {
			DriverManager.closeDriver();
		}
		
		
		
		
	

}
