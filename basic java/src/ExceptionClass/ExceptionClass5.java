package ExceptionClass;

public class ExceptionClass5 {

	public static void main(String[] args) {
		try {
			System.out.println("code inside the try block ");
			int num=40/0;
			System.out.println("value of num: "+num);
		}catch (Throwable e) {
			System.out.println(e);
		}finally {
			System.out.println("I am inside finally block ");
			int k=30/0;
			System.out.println("finally block always excuated");
		}
		System.out.println("rest of the program");
	} 

}
