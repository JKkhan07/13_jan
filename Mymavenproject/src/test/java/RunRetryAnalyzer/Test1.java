package RunRetryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1  {
	@Test
	public void test1() {
		Assert.assertEquals(false , true);
		
	}
	@Test
	public void test2() {
		Assert.assertEquals(true , false);
		
	}
}
