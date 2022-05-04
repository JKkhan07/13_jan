package ExceptionClass;

public class ExceptionClass7 {
	public static void validage(int age) {
		if(age<18) {
			throw new ArithmeticException("Person not eligible to vote ");
			
		}else {
			System.out.println("Person is eligible of vote ");
		}
		
	}

	public static void main(String[] args) {
		//validage(12);
		try{
			validage(17);
		}catch(ArithmeticException r) {
			System.out.println("Exception Handled");
			System.out.println(r);
		}
		
		System.out.println("rest program");
	}

}
