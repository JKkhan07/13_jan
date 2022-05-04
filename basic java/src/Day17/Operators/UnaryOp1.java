package Day17.Operators;

public class UnaryOp1 {

	public static void main(String[] args) {
		int x = 55;
		int y = x++;
		System.out.println("value of x = "+x);
		System.out.println("value of y = "+y);
		int g=x;
		System.out.println(g);
		int k=++g;
		System.out.println(k);
		System.out.println(g);
		System.out.println("**********************");
		int a = -15, b = 30;
		int res = a++ + --b;
		System.out.println("Result = "+res);
		System.out.println(a);
		System.out.println(b);
		
	
	}

}
