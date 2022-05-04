package ExceptionClass;

public class ExceptionClass0 {

	public static void main(String[] args) {
		System.out.println("Program Start Here ");
		//Abnormal Statement
		int i=10;
		int j=i/0;
		System.out.println("Result: ");
		//Abnormal Statement
		int[] id=new int[3];
		id[3]=100;
		//Abnormal Statement
		String s1=null;
		System.out.println(s1.length());
		//Abnormal Statement
		String s2="abc";
		int num=Integer.parseInt(s2);
		System.out.println("value of num: "+num);
		System.out.println("Program Ends here");
		

	}

}
