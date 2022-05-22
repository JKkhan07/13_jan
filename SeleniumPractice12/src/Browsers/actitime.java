package Browsers;


import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) {
		String driver1=".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver1);
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.actitime.com/");
		System.out.println("Page title name: "+c1.getTitle());
		System.out.println("page title length: "+c1.getTitle().length());
		System.out.println("page url: "+c1.getCurrentUrl());
		System.out.println("Page source: "+c1.getPageSource());
		System.out.println("page source length: "+c1.getPageSource().length());
		c1.close();
	}

}