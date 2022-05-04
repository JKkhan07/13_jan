package Blocks;

public class Blocks2 {
	static {
		System.out.println("This is static 1st block ");
	}
	{
		System.out.println("This non static 1st block ");
	}

	public static void main(String[] args) {
		System.out.println("Program start ");
		Blocks2 c1=new Blocks2();
		System.out.println("Program End ");

	}
	static {
		System.out.println("This is static 2nd block ");
	}
	{
		System.out.println("This non static 2nd block ");
	}

}
