package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdownList {

	public static void main(String[] args) {
		String driverpath = ".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement multi= driver.findElement(By.id("multiselect1"));
		Select s1 = new Select(multi);
		System.out.println("is there multiple select option: "+s1.isMultiple());
//		WebElement selectoption=s1.getFirstSelectedOption();
//		String selectname=selectoption.getText();
//		System.out.println("first selected option: "+s1.getFirstSelectedOption().getText());
		List<WebElement> option=s1.getOptions();
		System.out.println("total count: "+option.size());
		
		for(int i=0; i<option.size();i++ ) {
			System.out.println(option.get(i).getText());
		}
		s1.selectByIndex(0);
		s1.selectByValue("swiftx");
		s1.selectByVisibleText("Audi");
		List<WebElement> cars = s1.getAllSelectedOptions();
		System.out.println("selected cars: "+cars.size());
		
		s1.deselectByIndex(0);
		s1.deselectByValue("swiftx");
		
	}

}
