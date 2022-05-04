package ExceptionClass;

public class ExceptionClass6 {

	public static void main(String[] args) {
		System.out.println("program start");
		try {
			System.out.println("Inside try block ");
			int data=80/0;
			System.out.println("value of data: "+data);
		}catch (ArithmeticException r) {
			System.out.println("value of Exception: ");
			System.out.println(r);
		}finally {
			System.out.println("finally block always excueted");
		}
		System.out.println("program end");

	}

}
