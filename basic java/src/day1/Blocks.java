package day1;

public class Blocks {

	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}	
	public static void main(String[] args) {
		System.out.println("main() Starts");
		Blocks b1=new Blocks();
		System.out.println("---------------------------------");
		//Blocks b2=new Blocks();
		//System.out.println("main() ends");
	}	
	/* non-static block or IIB*/
	{
		System.out.println("running non-static-block-2 of class Blocks4..");
	}	

}
