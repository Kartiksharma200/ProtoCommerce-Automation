package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	 private static WebDriver driver;

	    public static WebDriver getDriver() {
	    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        if (driver == null) {
	        	WebDriverManager.chromedriver().setup();// Auto-manage ChromeDriver
	        	driver = new ChromeDriver();
	        //	WebDriverManager.firefoxdriver().setup();
	        //    driver = new FirefoxDriver();
	            driver.manage().window().maximize();
	        }
	        return driver;
	    }

	    public static void closeDriver() {
	    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }

}
