package Blocks;

public class Blocks3 {
	static int age;
	double salary;
	static {
		 age = 30;
	}
	{
		 salary=45000;
	}

	public static void main(String[] args) {
		System.out.println("program start ");
		System.out.println("Age"+Blocks3.age);
		Blocks3 c1=new Blocks3();
		System.out.println("Saalary "+c1.salary);
		System.out.println("Program End");
		

	}

}
