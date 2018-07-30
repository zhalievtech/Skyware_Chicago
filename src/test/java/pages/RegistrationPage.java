package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class RegistrationPage {

	public RegistrationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

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
	
	

}

