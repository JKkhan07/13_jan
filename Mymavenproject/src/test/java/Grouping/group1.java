package Grouping;

import org.testng.annotations.Test;

public class group1 {
	@Test(groups="Smoke Test")
	public void testone() {
		System.out.println("This is method one ");
		
	}
	@Test(groups="sanity Test")
	public void testtwo() {
		System.out.println("this is method two ");
		
	}
	@Test(groups="Smoke Test")
	public void testthree() {
		System.out.println("this is method three ");
		
	}@Test(groups="sanity Test")
	public void testfour() {
		System.out.println("this is method four ");
		
	}@Test(groups="Smoke Test")
	public void testfive() {
		System.out.println("this is method five ");
		
	}@Test(groups="sanity Test")
	public void testsix() {
		System.out.println("this is method six ");
		
	}
}
