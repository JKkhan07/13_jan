package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		String driver=".\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver);
		WebDriver jkl =new ChromeDriver();
		jkl.get("https://www.google.com/");
		String SourceCode=jkl.getPageSource();
		System.out.println("Aplication source code: "+SourceCode);
		System.out.println("length of source code: "+SourceCode.length());
		System.out.println("Current URL: "+jkl.getCurrentUrl());
		System.out.println("Title of Page"+jkl.getTitle());
		jkl.close();
		}

}
