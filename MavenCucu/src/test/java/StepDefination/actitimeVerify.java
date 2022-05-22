package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.SeleniumUtility;

public class actitimeVerify extends SeleniumUtility {
	WebDriver driver;
	@Given("User is already having actitime url{String}")
    public void user_is_already_having_actitime_url(String url) {
      driver=setUp("chrome", url);
    }

    @When("user enter username as {String}")
    public void user_enter_username_as(String username)  {
    	driver.findElement(By.name("username")).sendKeys(username);
    
    }
    @And("user enter password as {String}")
    public void user_enter_password_as(String password)  {
    	driver.findElement(By.name("pwd")).sendKeys(password);
    	
    }
    @And("click on login button")
    public void click_on_login_button() {
    	driver.findElement(By.id("loginButton")).click();
        
    }


    @Then("verify that actitime page open with with title {String}")
    public void verify_that_actitime_page_open_with_with_title(String title) {
    	setSleepTime(2000);
    	Assert.assertEquals(driver.getTitle(), title, "Either login is not successful or page not loaded ");
        
    }
    
    @And("close the browser")
    public void close_the_browser() {
        driver.close();
    }

}


