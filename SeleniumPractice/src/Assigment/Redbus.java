package Assigment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		WebElement From=driver.findElement(By.id("src"));
		From.sendKeys("Pune");
		WebElement jk=driver.findElement(By.cssSelector(".homeSearch>*:nth-child(2)"));
		jk.click();
		WebElement to=driver.findElement(By.id("dest"));
		to.sendKeys("Goa");
		WebElement to1=driver.findElement(By.cssSelector("div>.autoFill>:nth-child(4)"));
		to1.click();
		WebElement calender=driver.findElement(By.cssSelector("td[class=\'next\']"));
		calender.click();
		WebElement calender1=driver.findElement(By.cssSelector("div.rb-calendar>.rb-monthTable >*:first-child>*:nth-of-type(6)>*:nth-of-type(6)"));
		calender1.click();
		WebElement bus =driver.findElement(By.cssSelector("div>button"));
		bus.click();
		WebElement Time = driver.findElement(By.cssSelector(".details>ul:nth-child(3)>li:nth-child(4)>label:nth-child(2)"));
		Time.click();
		WebElement Ac = driver.findElement(By.cssSelector(".details>ul:nth-child(5)>li:nth-child(3)>label:nth-child(2)"));
		Ac.click();
		List<WebElement> count=driver.findElements(By.cssSelector("ul.bus-items>div>li>div>div>div>div>div.travels"));
//		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		WebElement element = driver.findElement(By.xpath("//body"));
		element.sendKeys(Keys.ESCAPE);
		for (int j = 0; j < 2; j++) {
			element.sendKeys(Keys.PAGE_DOWN);
		for(int i=0;i<count.size();i++) {
			System.out.println(count.get(i).getText());
		}
		
	}
	}
}
