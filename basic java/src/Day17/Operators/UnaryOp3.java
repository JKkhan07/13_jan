package Day17.Operators;

public class UnaryOp3 {

	public static void main(String[] args) {
		int a = 0, b;
		b = a++ + ++a + ++a + a;
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
		System.out.println("*************************");
		a=-6;
		b= a-- +--a +--a + a;
		System.out.println("Value of a ="+a);
		System.out.println("Value of b ="+b);
		System.out.println("*************************");
		a=55;
		b= --a + --a + --a + a + ++a + ++a;
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);
		System.out.println("*************************");
		a=40;
		b=a-- + a + ++a + a++ + ++a + a++ + a;
		System.out.println("value of a ="+a);
		System.out.println("value of b = "+b);
	}

}
