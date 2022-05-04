package ExceptionClass;

import java.io.FileNotFoundException;

public class ExceptionClass10  {
	public static int divison(int i, int j)throws ArithmeticException {
		int div=i/j;
		return div;
	}

	public static void main(String[] args)throws FileNotFoundException {
		ExceptionClass10 obj = new ExceptionClass10();
		try {
			System.out.println(obj.divison(10, 2));
		}catch (Throwable r){
			System.out.println(r);
		}
		
		
	}

}
