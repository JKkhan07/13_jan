package PracticePro;

public class SwapTwoNum {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 10;		
		System.out.println("num1 value : "+num1);
		System.out.println("num2 value :"+num2 );
		int res = num1+num2;
		System.out.println(res);
		num1=res-num1;
		num2=res-num2;
		System.out.println("After value swap");
		System.out.println("num1 value : "+num1);
		System.out.println("num2 value : "+num2);

 
	}

}
