package Retryfailed;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
	@Test(retryAnalyzer=Retryfailed.Retryfail.class)
	public void test1(){
		Assert.assertEquals(true, false);
	}
	@Test
	public void test2() {
		Assert.assertEquals(true, false);
	}

}
