package Day10.Method;

public class Method1 {
	public static void printDetails(int age,double salary) {
		System.out.println("I am From Pune");
		System.out.println("I am "+age+"year old");
		System.out.println("I am getting "+salary);
	}
	public static void main(String[] args) {
		printDetails(22, 95000);
		printDetails(19, 85000.2);
		printDetails(48, 75000.00);
		
	}

}
