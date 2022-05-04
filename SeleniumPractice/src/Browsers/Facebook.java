package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		String driver2=".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver2);
		WebDriver s1 = new ChromeDriver();
		s1.get("https://www.facebook.com/");
		System.out.println("page title: "+s1.getTitle() );
		System.out.println("page length: "+s1.getTitle().length() );
		System.out.println("current url page: "+s1.getCurrentUrl());
		s1.close();
	}

}
