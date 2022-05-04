package day1;

class C {
	double i = 10.23;
	C(double j) {
		System.out.println("Running Class C constructor..");
		i = j;
	}
}
class B {
	int i = 10;

	B() {
		System.out.println("Running Class B constructor..");
		i = 23;
	}
}
public class cons1 {

	public static void main(String args[]) {
		System.out.println("Main() of Class Cons6 is started...");
		C b1 = new C(15);
		System.out.println("Class C global varibale i = " + b1.i);// 
		System.out.println("======================================");
		C b2 = new C(0.32);
		System.out.println("Class C global varibale i = " + b2.i);//
		System.out.println("Main() of Class Cons6 is ends here...");
		B b =new B();
		System.out.println("value of i is : "+b.i);
		B c= new B();
		System.out.println(c.i);
	}
}



