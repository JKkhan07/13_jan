package Day11.Conditions;

public class Ifcondition {

	public static void main(String[] args) {
		int num1=45, num2=35;
		if(!(num1==num2)) {
			System.out.println("Number1 is Greater than Number2");
		}else {
			System.out.println("number1 is less than Number2");
		}
		System.out.println("************************************");
		if (num1>num2) {
			System.out.println("Number1 is greater than Number2");
		}else {
			System.out.println("Number1 is less than Number2");
		}
		System.out.println("************************************");
		if(num1<num2) {
			System.out.println("Number1 is greater than Number2");
		}else {
			System.out.println("Number1 is less than Number2");
		}
		System.out.println("************************************");
		if(num1>=num2 && num1>num2) {
			System.out.println("number1 is greater than or equal to number 2");
		}else {
			System.out.println("number1 is greater than number2");
		}

	}

}
