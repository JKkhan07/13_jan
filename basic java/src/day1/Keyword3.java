package day1;

class D {
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
		// m();//same as this.m()
		this.m();
		//m();
	}
}
class Keyword3 {

	void methodOne() {
		System.out.println("Inside Method ONE");
	}
	void methodTwo() {
		System.out.println("Inside Method TWO");
		this.methodOne();// same as calling methodOne()
		//methodOne();
	}
	public static void main(String args[]) {
		Keyword3 obj = new Keyword3();
		obj.methodTwo();
		D a = new D();
		a.n();
	}
}

