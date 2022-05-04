package Assigment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver drv = new ChromeDriver();
		drv.manage().window().maximize();
		drv.get("https://demo.actitime.com/login.do");
		drv.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		String jk =drv.getCurrentUrl();
		System.out.println("Current page url: "+jk);
		String expectedTitle="actiTIME - Login";
		String actualTitle=drv.getTitle();
		if(actualTitle.equals(expectedTitle)){
		
		System.out.println("Login page opened");
		}else {
		System.out.println("login page get changed");
		}
		WebElement UserNameInputField=drv.findElement(By.id("username"));
		UserNameInputField.sendKeys("admin");
		WebElement PasswordInputField=drv.findElement(By.name("pwd"));
		PasswordInputField.sendKeys("manager");
		WebElement LoginButton=drv.findElement(By.id("loginButton"));
		LoginButton.click();
	
		String actualTitle1=drv.getTitle();
		System.out.println(actualTitle1);
		String expectedTitle1="actiTIME-Enter Time-Track";
		if(actualTitle.equals(expectedTitle1)) {
			System.out.println("home page is verified successful");
		}else {
			System.out.println("home page is changed");
		}
		
		WebElement task=drv.findElement(By.cssSelector("div>.navTable>tbody>tr>:nth-child(4)>a"));
		task.click();
		
		WebElement addtask=drv.findElement(By.cssSelector("div[class='title ellipsis']"));
		addtask.click();
		WebElement newtask=drv.findElement(By.cssSelector(".addNewMenu>:nth-child(3)"));
		newtask.click();
		//WebElement create = drv.findElement(By.cssSelector("div[style='display: block; top: 30px; left: 0px;']"));
//		Select s1=new Select(create);
//		List<WebElement> ct = s1.getOptions();
//		System.out.println("total option "+ct.size());
//		WebElement createtask=drv.findElement(By.cssSelector(".commitButtonPlaceHolder>div>div:nth-child(1)"));
//		createtask.click();
		//WebElement  jk1 = drv.findElement(By.cssSelector("td.nameCell.first"));
		Thread.sleep(3000);
		WebElement customer =drv.findElement(By.cssSelector(".selectCustomerRow>td>div>div>div>div>div"));
		customer.click();
		WebElement customer1=drv.findElement(By.cssSelector(".scrollableDropdownView>div>div>div>div:nth-child(4)"));
		customer1.click();
		WebElement project=drv.findElement(By.cssSelector(".projectSelector>div>div>div>div"));
		project.click();
		WebElement project1 = drv.findElement(By.cssSelector(".scrollableDropdownView>div>div>div>div:nth-child(5):last-child"));
		project1.click();
		
		
		
	}

}
