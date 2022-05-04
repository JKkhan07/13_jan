package Constructor;

public class Constructor6 {
	Constructor6(){
		System.out.println("zero para constructor");
		System.out.println("having no parameter");
	}
	Constructor6(int num1){
		System.out.println(" para constructor");
		System.out.println("having int parameter");
	}
	Constructor6(int num1, double num2){
		System.out.println("para constructor");
		System.out.println("having int and double parameter");
	}
	Constructor6(double num1,int num2){
		System.out.println("para constructor");
		System.out.println("having double and int parameter");
	}

	public static void main(String[] args) {
		System.out.println("program start");
		Constructor6 s1=new Constructor6();
		Constructor6 c1=new Constructor6(10);
		Constructor6 x1=new Constructor6(10,45.2);
		Constructor6 d1=new Constructor6(47.5,42);

	}

}
