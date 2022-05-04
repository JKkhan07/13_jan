package Day10.Method;

public class Method2 {
	public static void Getaddition(int num1, double num2) {
		double res = num1+num2;
		System.out.println("Additon result"+res);
	}
	public static double Getaddition1(int num1, double num2) {
		double res1 = num1+num2;
		return res1;
	}

	public static void main(String[] args) {
		Method2.Getaddition(25,78.77);
		System.out.println("*******************************************");
		double sum=Getaddition1(77, 50.05);
		System.out.println("Addition result"+sum);
		System.out.println("*****************************************");
		System.out.println(Getaddition1(25, 25));
		System.out.println("**********************************");
		double res=Method2.Getaddition1(20,20);
		res=res*100;
		System.out.println("New Result = "+res);
		
		
	}

}
