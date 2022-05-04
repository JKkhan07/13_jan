package PracticePro;

public class IfelseLargestnum {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 20;
		int num3 = 5;
		if(num1>=num2 && num1>=num3) {
			System.out.println("greater number is "+num1);
		}else if(num2>=num1 && num2>=num3){
			System.out.println("greater number is "+num2);
		}else {
			System.out.println("greater number is "+num3);
		}
	}

}
