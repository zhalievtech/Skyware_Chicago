package com.skyware.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skyware.utilities.Driver;

public class MyAccountPage {
	
	public MyAccountPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(linkText="Home")
	public WebElement homeMenuTab;

	@FindBy(linkText="Features")
	public WebElement featuresMenuTab;

	@FindBy(linkText="About Us")
	public WebElement aboutUsMenuTab;
	
	@FindBy(linkText="Inventory")
	public WebElement inventoryMenuTab;
	
	@FindBy(xpath="//div[@id='login']")
	public WebElement helloText;
	
	@FindBy(xpath="//div[@id='login']/a")
	public WebElement userEmail;
	
	@FindBy(id="loginAccountName")
	public WebElement accountName;
	
	@FindBy(xpath="//div[@class='techSupportText']/a")
	public WebElement emailUs;
	
	@FindBy(xpath="//a[@id='subtabLink']")
	public WebElement logout;



}
