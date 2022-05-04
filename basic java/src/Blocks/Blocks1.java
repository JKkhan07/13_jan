package Blocks;

public class Blocks1 {
	{
		System.out.println("This is non static 1st block ");
	}
	

	public static void main(String[] args) {
		System.out.println("Program start ");
		Blocks1 c1=new Blocks1();
		System.out.println("**************************");
		Blocks1 x1=new Blocks1();
		System.out.println("Program End ");
		

	}
	{
		System.out.println("This is non static 2st block ");

	}

}
