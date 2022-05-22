package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class HomePage extends SeleniumUtility {
	WebDriver driver;
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, HomePage.class);
	}
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public WebElement getLogoutlink() {
		return logoutLink;
	}
	public void logoutapp() {
		clickOnElement(logoutLink);
	}
	public String gethomepagetitle() {
		waitForElementToBeClickable(logoutLink);
		return getCurrentTitleOfApplication();
		
	}

}
