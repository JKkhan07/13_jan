package day1;
class Methodover{
	public void Methodover(int num1,int num2) {
		int res=num1+num2;
		System.out.println(res);
	}
	public void Methodover(int num1,double num2) {
		double res=num1-num2;
		System.out.println(res);
	}
	void Methods(int a,int b) {
		System.out.println("this is non static ,Method");
	}
}
public class Demo {
	int age=20;
	static int salary=45000;
	static int method(int a,int b) {
		return a+b;
	}
	static double method(int a,double b) {
		return a-b;
	}
	static void display() {
		System.out.println("I am static method of the class");
	}
	static double Addnumber(int num1,int num2) {
		return num1+num2;
	}
	static double Addnumber1(int num1,int num2) {
		return num1-num2;
	}

	public static void main(String[] args) {
		Demo s1= new Demo();
		System.out.println("My name is Javed ");
		System.out.println("My age is "+s1.age);
		System.out.println("My salary is "+Demo.salary);
		System.out.println(Demo.method(10,20));
		System.out.println(Demo.method(14, 4.0));
		System.out.println(Demo.Addnumber(50, 20));
		System.out.println(Demo.Addnumber1(40, 10));
		Demo.display();
		Methodover obj = new Methodover();
		obj.Methodover(20, 30);
		obj.Methods(1, 5);

	}

}
