package ExceptionClass;

public class ExceptionClass3 {

	public static void main(String[] args) {
		System.out.println("Program Start");
		try {
			int[]a1=new int[4];
			a1[3]=40/0;
		}catch(ArithmeticException g) {
			System.out.println("Arithmetic Exception occurs");
		}catch(ArrayIndexOutOfBoundsException g) {
			System.out.println("Array Index Out Of Bounds Exception occurs");
		}catch(Exception g) {
			System.out.println("Parent Exception occurs ");
		}try {
			int a[] = new int[5];
			a[5] = 30 / 2;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Program Ends");
		
	}

}
