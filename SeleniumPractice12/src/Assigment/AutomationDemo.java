package Assigment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");					
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		System.out.println("**********for mouse hover *************");
		List<WebElement> mousehover=driver.findElements(By.cssSelector(".navbar-collapse>ul>li"));
		System.out.println("Total mainmenu count: "+mousehover.size());
		Actions a1 = new Actions(driver);
		for(int a=0; a<mousehover.size();a++) {
			WebElement options=mousehover.get(a);
			a1.moveToElement(options).perform();
			Thread.sleep(2000);
		}
		System.out.println("*****************************");
		WebElement first = driver.findElement(By.cssSelector("input[ng-model='FirstName']"));
		first.sendKeys("JAVED",Keys.TAB);
		WebElement last = driver.findElement(By.cssSelector("input[ng-model='LastName']"));
		last.sendKeys("KHAN");
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Pune");
		driver.findElement(By.cssSelector("input[ng-model='EmailAdress']")).sendKeys("j.pathan0070@gmail.com");
		driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("8855992216");
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		WebElement element = driver.findElement(By.xpath("//body"));
		for (int i = 0; i < 10; i++) {
			element.sendKeys(Keys.PAGE_DOWN);
		}
		driver.findElement(By.cssSelector("div[id='msdd']")).click();
		driver.findElement(By.cssSelector(".col-md-4>multi-select>div>ul>:nth-child(8)")).click();
		WebElement skills = driver.findElement(By.id("Skills"));
		Select s1 = new Select(skills);
		List<WebElement> option=s1.getOptions();
		System.out.println("total skills count: "+option.size());
		s1.selectByVisibleText("Software");
		System.out.println("************************For country************");
		driver.findElement(By.cssSelector(".select2-selection")).click();
		driver.findElement(By.cssSelector(".select2-results>ul>:nth-child(6)")).click();
//		
//		Select s2 = new Select(country);
//		List<WebElement> list = s2.getOptions();
//		System.out.println("Total country: "+list.size());
//		s2.selectByVisibleText("India");
		System.out.println("************for year***************");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement year = driver.findElement(By.id("yearbox"));
		Select y1 = new Select(year);
		List<WebElement> years=y1.getOptions();
		System.out.println("total year: "+years.size());
		y1.selectByVisibleText("1994");
		System.out.println("***********for month**************");
		WebElement month = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
		Select m1 = new Select(month);
		List<WebElement> month1=m1.getOptions();
		System.out.println("total month: "+month1.size());
		m1.selectByVisibleText("June");
		System.out.println("***********for day**************");
		WebElement day = driver.findElement(By.xpath("//select[@ng-model='daybox']"));
		Select d1 = new Select(day);
		List<WebElement> days=d1.getOptions();
		System.out.println("total days: "+days.size());
		d1.selectByVisibleText("21");
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("Javed@123");
		driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("Javed@123");
		driver.close();
		
	}

}
