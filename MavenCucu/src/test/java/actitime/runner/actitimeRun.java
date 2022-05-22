package actitime.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"src\\test\\resources\\feature\\Test.feature"},
		glue = {"StepDefination"},
		plugin = {"html:target/cucumber-html-report"},
		monochrome = true
		)

public class actitimeRun extends AbstractTestNGCucumberTests {
	

}
