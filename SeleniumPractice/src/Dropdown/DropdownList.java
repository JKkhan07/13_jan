package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

	public static void main(String[] args) {
		String driverpath = ".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demosite.executeautomation.com/");
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		WebElement dropdown = driver.findElement(By.name("TitleId"));
		Select s1 = new Select(dropdown);
		System.out.println("is it multipule dropdownlist: " + s1.isMultiple());
		List<WebElement> option = s1.getOptions();
		System.out.println("Option count: " + option.size());
		for (int i = 0; i < option.size(); i++) {
			System.out.println(option.get(i).getText());
		}
		String Selectedvalue = s1.getFirstSelectedOption().getText();
		System.out.println("first selected option: " + Selectedvalue);
		s1.selectByVisibleText("Mr.");

	}

}
