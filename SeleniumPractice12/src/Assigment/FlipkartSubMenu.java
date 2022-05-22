package Assigment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSubMenu {

	public static void main(String[] args) {
		String driverpath = ".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		String actualhomepage = driver.getTitle();
		System.out.println("actual home page title: "+actualhomepage);
		String expectedhomepage = ("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		if(actualhomepage.equals(expectedhomepage)) {
			System.out.println("home is varified");
		}else {
			System.out.println("home page has been changed ");
		}
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		List<WebElement> flipkart=driver.findElements(By.cssSelector("._37M3Pb>div>a"));
		System.out.println("phones counts: "+flipkart.size());
		for(int i=0; i<flipkart.size();i++) {
			WebElement flip=flipkart.get(i);
			act.moveToElement(flip).build().perform();
			System.out.println(flip.getText());
			System.out.println("##########"+flipkart.get(i).getText()+" ########");
		}
		

	}

}
