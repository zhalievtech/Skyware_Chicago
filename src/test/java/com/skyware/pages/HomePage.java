package com.skyware.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skyware.utilities.Driver;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(linkText="Register")
	public WebElement registerButton;
	
	@FindBy(xpath="//a[@class='button login']")
	public WebElement loginButton;
	
}
