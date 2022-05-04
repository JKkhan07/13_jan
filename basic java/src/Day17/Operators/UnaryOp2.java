package Day17.Operators;

public class UnaryOp2 {

	public static void main(String[] args) {
		int a = 0, b;
		b = a++ + ++a + ++a + a;
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
		System.out.println("*************************");
		a=0;
		b= a-- +--a +--a + a;
		System.out.println("Value of a ="+a);
		System.out.println("Value of b ="+b);
		System.out.println("*************************");
		a=0;
		b= --a + --a + --a + a + ++a + ++a;
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
		System.out.println("*************************");
		a=0;
		b=a-- + a + ++a + a++ + ++a + a++ + a;
		System.out.println("value of a ="+a);
		System.out.println("value of b = "+b);
	}

}
