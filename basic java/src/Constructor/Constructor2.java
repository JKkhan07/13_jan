package Constructor;

public class Constructor2 {
	int age;
	double salary;
	void print() {
		System.out.println("I am javed my age is " + age +" and my salary is "+salary);
	}
	
	public static void main(String[] args) {
		Constructor2 c1=new Constructor2();
		System.out.println("Age "+c1.age);
		System.out.println("salary "+c1.salary);
		c1.print();

	}

}
