package Day11.MethodOverloading;

public class Methodoverloading {
	static int addnumber(){
	int num1=10, num2=40;
	return num1+num2;
	}
	static int addnumber(int num1, int num2) {
		return num1+num2;
	}
	static double addnumber(int num1, double num2, int num3) {
		return num1+num2+num3;
	}
	public static void javed() {
		System.out.println("Hi i am jk");
	}

	public static void main(String[] args) {
		int num1=30;
		int num2=40;
		int result = num1+num2;
		System.out.println("addition Result="+result);
		System.out.println("********************************");
		System.out.println(Methodoverloading.addnumber());
		System.out.println("********************************");
		System.out.println(Methodoverloading.addnumber(10, 20));
		System.out.println("********************************");
		System.out.println(Methodoverloading.addnumber(10, 15.5, 20));
		System.out.println("********************************");
		javed();
		

	}

}
