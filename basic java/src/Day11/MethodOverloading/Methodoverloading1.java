package Day11.MethodOverloading;

public class Methodoverloading1 {
	int subtraction() {
	int num1=15, num2=10;
	return num1-num2;
	}
	int subtraction(int num1,int num2) {
		return num1-num2;
	}
	double subtraction(int num1, double num2, int num3 ) {
		return (num1-num2)-num3;
	}

	public static void main(String[] args) {
		Methodoverloading1 jk=new Methodoverloading1();
		System.out.println(jk.subtraction());
		System.out.println(jk.subtraction(20, 40));
		System.out.println(jk.subtraction(10,50,5));
	}

}
