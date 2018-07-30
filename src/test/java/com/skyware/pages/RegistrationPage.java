package com.skyware.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skyware.utilities.Driver;

public class RegistrationPage {

	public RegistrationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}



	@FindBy(xpath = "//div[@class='basic-info']/h3")
	public WebElement BasicInfo;
	
	@FindBy(xpath = "//div[@class = 'profile-info']/h3")
	public WebElement ProfilInfo;
	
	@FindBy(id="accountName")
	public WebElement companyNameBox;
	
	@FindBy(id="email")
	public WebElement emailBox;
	
	@FindBy(id="password")
	public WebElement passwordBox;
	
	@FindBy(id="password2")
	public WebElement confirmPasswordBox;
	
		
	@FindBy(id="profile_firstName")
	public WebElement firstNameBox;
	
	@FindBy(id="profile_lastName")
	public WebElement lastNameBox;
	
	@FindBy(id="countrySelect")
	public WebElement countrySelect;
	
	@FindBy(id="profile_address1")
	public WebElement addressBox1;
	
	@FindBy(id="profile_address2")
	public WebElement addressBox2;
	
	@FindBy(id="profile_city")
	public WebElement cityBox;
	
	@FindBy(id="stateSelect")
	public WebElement stateSelect;
	
	@FindBy(id="profile_zip")
	public WebElement zipBox;
	
	@FindBy(id="profile_phone")
	public WebElement phoneBox;

	
	@FindBy(xpath="//div[@class='basic-info']/label[1]")
	public WebElement emailText;
	
	@FindBy(xpath="//div[@class='basic-info']/label[2]")
	public WebElement passwordText;
	
	@FindBy(xpath="//div[@class='basic-info']/label[3]")
	public WebElement passwordConfirmText;
	
	@FindBy(xpath="//div[@class='profile-info']/label[1]")
	public WebElement companyNameText;
	
	@FindBy(xpath="//div[@class='profile-info']/label[2]")
	public WebElement firstNameText;
	
	@FindBy(xpath="//div[@class='profile-info']/label[3]")
	public WebElement lastNameText;
	
	@FindBy(xpath="//div[@class='profile-info']/label[4]")
	public WebElement countryText;
	
	@FindBy(xpath="//div[@class='profile-info']/label[7]")
	public WebElement cityText;
	
	@FindBy(xpath="//div[@class='profile-info']/label[8]")
	public WebElement stateText;
	
	@FindBy(id="licenseAccepted")
	public WebElement accepteCheckbox;
	
	@FindBy(xpath="//div[@class='license-info']/span")
	public WebElement checkBoxStar;
	
	@FindBy(xpath="//input[@name='userProfile.licenseAccepted']")
	public WebElement isLicenseDisplayed;

}

