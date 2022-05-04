package WrapperClass;

public class WrapperClass0 {

	public static void main(String[] args) {
		int s=95;
		Integer a1=new Integer(s);
		Integer a2=new Integer(95);
		Integer a3=s;
		System.out.println("s: "+s+"\na1: "+a1+"\na2: "+a2+"\na3: "+a3);
		System.out.println("***Unboxing of boxed object*****");
		Integer a=new Integer(2);
		int b=a.intValue();
		System.out.println("a: "+a+"\nb: "+b);
		System.out.println("a==b: "+(a==b));
		System.out.println("a.equals(b): "+a.equals(b));

	}

}
