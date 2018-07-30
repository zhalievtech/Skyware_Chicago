package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class RegistrationPage {

	public RegistrationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		
	}

	@FindBy(id="accountName")
	public WebElement accountNameBox;
	
	
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



}

