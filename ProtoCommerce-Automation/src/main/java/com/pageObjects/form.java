package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class form {
	
	WebDriver driver;
	
	@FindBy (xpath = "//a[@class='navbar-brand']")
	WebElement PageTittle;
	
	@FindBy (xpath = "//div[@class='form-group']//input[@name='name']")
	WebElement NameField;
	
	@FindBy (xpath = "//input[@name='email']")
	WebElement EmailField;
	
	@FindBy (xpath = "//input[@id='exampleInputPassword1']")
	WebElement PassField;
	
	@FindBy (xpath = "//input[@id='exampleCheck1']")
	WebElement Checkbox;
	
	@FindBy (xpath = "//input[@id='inlineRadio1']")
	WebElement TickBox;
	
	@FindBy (xpath = "//input[@name='bday']")
	WebElement DOBField;
	
	@FindBy (xpath = "//input[@value='Submit']")
	WebElement submitbtn;
	
	public form(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyTittle() {
		if(PageTittle.isDisplayed()) {
			System.out.println("<--------Verify Tittle-------->");
		}else {
			System.out.println("<--------Failed to verify--------->");
		}
	}
	
	public void enterName(String name) {
		NameField.sendKeys(name);
	}
	
	public void enterEmail(String email) {
		EmailField.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		PassField.sendKeys(password);
	}
	
	public void clickCheckBox() {
		Checkbox.click();
	}
	
	public void ClickTickBox() {
		TickBox.click();
	}
	
	public void enterDOB(String DOB) {
		DOBField.sendKeys(DOB);
	}
	
	public void clickOnSubmit() {
		submitbtn.click();
	}

}
