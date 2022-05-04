package Blocks;

public class Blocks4 {
	int age= 25;
	double salary=25000;
	void print() {
		System.out.println("Age "+age);
		System.out.println("salary "+salary);
	}

	public static void main(String[] args) {
		System.out.println("Program star ");
		Blocks4 c1=new Blocks4();
		c1.print();
		c1.salary=85000;
		c1.print();
	}

}
