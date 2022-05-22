package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class LoginPage extends SeleniumUtility{
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, LoginPage.class);
	}
	
	@FindBy(id="username")
	private WebElement usernameInputField;
	
	@FindBy(name="pwd")
	private WebElement passwordInputField;
	
	@FindBy(id="loginbutton")
	private WebElement loginbutton;

	public WebElement getUsernameInputField() {
		return usernameInputField;
	}

	public WebElement getPasswordInputField() {
		return passwordInputField;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public void login(String username, String password ) {
		typeInput(usernameInputField,username);
		typeInput(passwordInputField, password);
		clickOnElement(loginbutton);
	}
}
