package ParallelExecution;

import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class ParallelMethod extends  SeleniumUtility {
	@Test
	public void testcase1() {
		setUp("chrome", "https://www.google.com");
	}
	@Test
	public void testcase() {
		setUp("Firefox", "https://www.youtube.com/");
	}

}
