package Assigment;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/sortable/");
		Actions act = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		for(int i=6;i>0;i--) {
			//System.out.println(source.get(i).getText());
			WebElement dest = driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
			WebElement source = driver.findElement(By.xpath("//ul[@id='sortable']/li["+i+"]"));
			act.dragAndDrop( dest, source).build().perform();
			Thread.sleep(2000);
			
			
		
			
			
		}
		
		
			
		} 
		
		
	}


