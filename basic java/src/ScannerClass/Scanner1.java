package ScannerClass;

import java.util.Scanner;

public class Scanner1 {


	public static void main(String[] args) {
		Scanner sb=new Scanner(System.in);
		int age=10;
		double salary=35000.25;
		boolean valid;
		String name="pune";
		System.out.println("Get age value from console ");
		age=sb.nextInt();
		System.out.println("Get salary value from console ");
		salary=sb.nextDouble();
		System.out.println("Get name value from console ");
		name=sb.next();
		System.out.println("Get valid value from console ");
		valid=sb.nextBoolean();
		System.out.println("age: "+age);
		System.out.println("salary: "+salary);
		System.out.println("name: "+name);
		System.out.println("valid: "+valid);
	}

}
