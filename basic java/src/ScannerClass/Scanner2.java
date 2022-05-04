package ScannerClass;

import java.util.Scanner;

public class Scanner2 {


	public static void main(String[] args) {
		String s="Hello this Javaclass ";
		Scanner s2=new Scanner(s);
		System.out.println("Boolean result: "+s2.hasNext());
		System.out.println("String: "+s2.nextLine());
		s2.close();
		System.out.println("--------Enter Your Details-------- ");
		Scanner in =new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name=in.next();
		System.out.println("Name: "+name);
		System.out.print("Enter your age: ");
		int i = in.nextInt();
		System.out.println("Age: " + i);
		System.out.print("Enter your salary: ");
		double d = in.nextDouble();
		System.out.println("Salary: " + d);
		in.close();
	}

}
