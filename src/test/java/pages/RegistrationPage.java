package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class RegistrationPage {

	public RegistrationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	
	@FindBy( xpath="//select[@id='stateSelect]")
	public WebElement StateProvince;
   
	
	@FindBy(xpath="//input[@id='profile_zip']")
	public WebElement ZipCode;
	
	@FindBy(xpath = "//input[@id='profile_phone']")
	public WebElement PhoneNumber;
	
	
}

