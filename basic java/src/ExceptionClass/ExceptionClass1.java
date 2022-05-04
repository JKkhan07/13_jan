package ExceptionClass;

import java.util.Scanner;

public class ExceptionClass1 {

	public static void main(String[] args) {
		System.out.println("Program Start Here ");
		int i,j,k;
		Scanner c1=new Scanner(System.in);
		try {
			System.out.println("Enter i value: ");
			i=c1.nextInt();
			System.out.println("Enter j vaule: ");
			j=c1.nextInt();
			k=i/j;
			System.out.println("Result: "+k);
			
		}catch(ArithmeticException g) {
			System.out.println("Exception Handling: "+g);
		}
		System.out.println("Program Ends");
	}

}
