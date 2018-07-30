package com.skyware.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skyware.utilities.Driver;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="username")
	public WebElement username;
	
	@FindBy(id="password")
	public WebElement password;

	@FindBy(xpath="//div[@class='buttons']/input")
	public WebElement loginButton;
	
	@FindBy(id="messages")
	public WebElement logoutMessage;
	
}
