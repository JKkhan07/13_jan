package Day10.Method;

public class Method4 {
	public static double Getsimpleintrest(int p, double r, int t) {
		double res = (p*r*t)/100;
		return res;
	}
	public static void Getsimpleintrest1(int p, double r,int t) {
		double res1=(p*r*t)/100;
		System.out.println("simple intrest = "+res1);
	}
	public static double Getsimpleintrest2(int p, double r, int t) {
		return (p*r*t)/100;
	}

	public static void main(String[] args) {
		System.out.println(Getsimpleintrest(35000, 5.5, 30));
		System.out.println("************************************");
		Method4.Getsimpleintrest1(35000, 5.5, 30);
		System.out.println("************************************");
		System.out.println(Getsimpleintrest(35000, 5.5, 30));
		
		
		
	}

}
