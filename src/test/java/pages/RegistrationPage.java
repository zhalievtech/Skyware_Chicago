package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class RegistrationPage {

	public RegistrationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	 
	@FindBy(id="email")
	public WebElement emailBox;
	
	@FindBy(id="password")
	public WebElement passwordBox;
	
	@FindBy(id="password2")
	public WebElement confirmPasswordBox;
	
	

}

