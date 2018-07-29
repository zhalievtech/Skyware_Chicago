package com.skyware.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import pages.HomePage;


import utilities.Driver;
import utilities.ConfigReader;

public class SmokeTest {

	@BeforeClass
	
	public void setUp() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
	}
	@Test
	public void checkHomePageTitle() {
		String actualTitle = Driver.getDriver().getTitle();
		String expectedTitle = "Skyware Inventory | Free Web Based Inventory Tracking Software";
		Assert.assertEquals(actualTitle, expectedTitle);
		
		HomePage hp= new HomePage();
		hp.registerButton.click();
		
		
		
	

		
		
	}
	

	

}
