package ExceptionClass;

import java.util.Scanner;

public class ExceptionClass2 {

	public static void main(String[] args) {
		System.out.println(" Program Start ");
		Scanner s=new Scanner(System.in);
		try {
		System.out.println("Enter array Size");
		int a=s.nextInt();
		int[] empid=new int[a];
		
			System.out.println(empid[3]);// ArrayIndexOutOfBoundsException
		}catch(ArrayIndexOutOfBoundsException t) {
			System.out.println(t);
		}
		System.out.println("Program Ends");

	}

}
