package Day10.Method;

public class Method3 {
	public static double Getsubtraction(double num1, double num2) {
		double res = num1-num2;
		return res;
	}
	public static void Getsubtraction1(double num1, double num2) {
		double res1 = num1-num2;
		System.out.println("Getsubtraction "+ res1);
	}

	public static void main(String[] args) {
		System.out.println(Method3.Getsubtraction(25, 15));
		System.out.println("*************************************");
		Method3.Getsubtraction1(60, 30);
		System.out.println("*******************************");
		double res=(Method3.Getsubtraction(55, 45));
		res=res*10;
		System.out.println("new Resutl ="+res);
		
	}

}
