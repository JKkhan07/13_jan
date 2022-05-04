package Inheritance;

class A2 {
	void msg() {
		System.out.println("Hello");
	}
}
class B2 {
	void msg() {
		System.out.println("Welcome");
	}
}
class Inheritance4 extends A2{
	
	Inheritance4(){
		super();//confusion 
	}

	public static void main(String args[]) {
		Inheritance4 obj = new Inheritance4();
		obj.msg();
	}
}