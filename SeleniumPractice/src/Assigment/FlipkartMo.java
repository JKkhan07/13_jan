package Assigment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartMo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		List<WebElement> flip = driver.findElements(By.cssSelector(".InyRMC>div>div"));
		System.out.println("Total flipkart mainmenu count: "+flip.size());
		Actions a1 = new Actions(driver);
		for(int i=0; i<flip.size();i++) {
			WebElement options=flip.get(i);
			System.out.println("names: "+options.getText());
			a1.moveToElement(options).perform();
			Thread.sleep(1000);
			
			
			
			
		}


	}

}
