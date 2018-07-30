package com.skyware.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

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

import com.skyware.pages.HomePage;
import com.skyware.pages.LoginPage;
import com.skyware.pages.MyAccountPage;
import com.skyware.pages.RegistrationPage;
import com.skyware.utilities.ConfigReader;
import com.skyware.utilities.Driver;

public class SmokeTest {
	
	HomePage hp= new HomePage();
	RegistrationPage rp = new RegistrationPage();
	MyAccountPage map = new MyAccountPage();
	LoginPage lp = new LoginPage();

	@BeforeClass
	public void setUp() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));

		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

	@Test(priority=0)
	public void checkHomePageTitle() {
		String actualTitle = Driver.getDriver().getTitle();
		String expectedTitle = "Skyware Inventory | Free Web Based Inventory Tracking Software";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
		
	@Test(priority=1)
	public void verifyRegistrationPageFields() {
			hp.registerButton.click();
			assertTrue(rp.emailBox.isDisplayed());	 
			assertTrue(rp.passwordBox.isDisplayed());
			assertTrue(rp.confirmPasswordBox.isDisplayed());
			assertTrue(rp.companyNameBox.isDisplayed());
			assertTrue(rp.firstNameBox.isDisplayed());
			assertTrue(rp.lastNameBox.isDisplayed());
			assertTrue(rp.countrySelect.isDisplayed());
			assertTrue(rp.addressBox1.isDisplayed());
			assertTrue(rp.addressBox2.isDisplayed());
			assertTrue(rp.cityBox.isDisplayed());
			assertTrue(rp.stateSelect.isDisplayed());
			assertTrue(rp.zipBox.isDisplayed());
			assertTrue(rp.phoneBox.isDisplayed());
			assertTrue(rp.accepteCheckbox.isDisplayed());
			assertFalse(rp.isLicenseDisplayed.isSelected());
			
			assertTrue(rp.BasicInfo.isDisplayed());
			assertTrue(rp.ProfilInfo.isDisplayed());
			
			assertTrue(rp.emailText.isDisplayed());
			assertTrue(rp.passwordText.isDisplayed());
			assertTrue(rp.passwordConfirmText.isDisplayed());
			assertTrue(rp.companyNameText.isDisplayed());
			assertTrue(rp.firstNameText.isDisplayed());
			assertTrue(rp.lastNameText.isDisplayed());
			assertTrue(rp.countryText.isDisplayed());
			assertTrue(rp.cityText.isDisplayed());
			assertTrue(rp.stateText.isDisplayed());
			assertTrue(rp.checkBoxStar.isDisplayed());
			assertTrue(rp.isLicenseDisplayed.isDisplayed());
		      
			
		}
	
	@Test(priority=2)
	public void verifyMyAccountPageFields() {
		
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		hp.loginButton.click();
		lp.username.sendKeys(ConfigReader.getProperty("username"));
		lp.password.sendKeys(ConfigReader.getProperty("password"));
		lp.loginButton.click();

		// verifying visibility of menu tabs		
		assertTrue(map.homeMenuTab.isDisplayed());
		assertTrue(map.featuresMenuTab.isDisplayed());
		assertTrue(map.aboutUsMenuTab.isDisplayed());
		assertTrue(map.inventoryMenuTab.isDisplayed());
		
		// verifying hello, [user email] on top-right corner
		String actualGreeting = map.helloText.getText();
		String expectedGreeting = "Hello, " + ConfigReader.getProperty("username") + "!";
		assertEquals(actualGreeting, expectedGreeting);
		
		// verifying account name is visible and accurate
		String actualAccountName = map.accountName.getText();
		String expectedAccountName = "12334";
		assertEquals(actualAccountName, expectedAccountName);
		
		// verifying email us for support link is visible and clickable
		String actualText = map.emailUs.getText();
		String expectedText = "email us";
		assertEquals(actualText, expectedText);
		assertTrue(map.emailUs.isEnabled());
		
		// verifying logout button is visible and user can logout
		String actualLinkText = map.logout.getText();
		String expectedLinkText = "Logout";
		assertEquals(actualLinkText, expectedLinkText);
		map.logout.click();
		String actualMessage = lp.logoutMessage.getText();
		String expectedLink =  "You have successfully logged out.";
		
		
	}
			         	
}
