package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class RegistrationPage {

	public RegistrationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id="//select[@id=\"countrySelect\"]")
	public WebElement countrySelect;
	
	
	@FindBy(id="//input[@id=\"profile_address1\"]")
	public WebElement address;
	
	@FindBy(id="//input[@id=\"profile_city\"]")
	public WebElement citySelect;

	
	@FindBy(xpath = "//div[@class='basic-info']/h3")
	public WebElement BasicInfo;
	
	@FindBy(xpath = "//div[@class = 'profile-info']/h3")
	public WebElement ProfilInfo;
}

