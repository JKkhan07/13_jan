package Constructor;

class A{
	int i;
	A(int k){
		i=k;
		System.out.println("This is class A cons ");
	}
}
class B{
	double i;
	B(double k){
		i=k;
		System.out.println("This is class B cons ");
	}
}


public class Constructor4 {
	

	public static void main(String[] args) {
		A a1=new A(10);
		System.out.println("value of int "+a1.i);
		System.out.println("**********************");
		B b1=new B(15.15);
		System.out.println("value of int "+b1.i);
		

	}

}
