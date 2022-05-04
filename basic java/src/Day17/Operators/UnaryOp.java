package Day17.Operators;

public class UnaryOp {

	public static void main(String[] args) {
		int a = 14;
		int b = a;
		System.out.println("value of a ="+a);
		System.out.println("value of b ="+b);
		int j = ++a;
		System.out.println("value of j ="+j);
		System.out.println("value of a ="+a);
		int m = b++;
		System.out.println("value of b ="+b);
		System.out.println("value of m ="+m);
		System.out.println("*************************");
		int l = 44;
		System.out.println("for l++ = "+l++);
		System.out.println("for l = "+l);
		System.out.println("for ++l = "+(++l));
		System.out.println("for l = "+l);
		System.out.println("*************************");
		int w = 55;
		System.out.println("for w-- = "+w--);
		System.out.println("for w = "+w);
		System.out.println("for --w ="+(--w));
		System.out.println("for w = "+w);


	}

}
