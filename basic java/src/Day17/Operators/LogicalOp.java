package Day17.Operators;

public class LogicalOp {

	public static void main(String[] args) {
		int age = 18;
		char bldgrp='A';
		boolean res1, res2;
		res1=(age>18);
		res2=(bldgrp=='A');
		System.out.println("Result1="+res1);
		System.out.println("Result2="+res2);
		// For logical AND 
		System.out.println("Result1 && Result2 ="+(res1&&res2));
		// For logical OR
		System.out.println("Result1 || Result2 ="+(res1||res2));
		// For logical Not
		System.out.println("!(Result1 && Result2 ="+!(res1&&res2));
		
		
	}

}
