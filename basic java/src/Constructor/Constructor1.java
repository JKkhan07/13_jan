package Constructor;

public class Constructor1 {
	Constructor1(){
		System.out.println("zero para ");
	}
	Constructor1(int num1){
		System.out.println("Int para");
	}
	Constructor1(int num1, int num2){
		System.out.println("Int-Int para");
	}
	Constructor1(int num1, double num2){
		System.out.println("Int-double para");
	}
	Constructor1(double num1, int num2){
		System.out.println("double-Int para");
	}

	public static void main(String[] args) {
		Constructor1 c1=new Constructor1();
		Constructor1 s1=new Constructor1(10);
		Constructor1 a1=new Constructor1(10,20);
		Constructor1 x1=new Constructor1(10,15.2);
		Constructor1 z1=new Constructor1(45.2,14);

	}

}
