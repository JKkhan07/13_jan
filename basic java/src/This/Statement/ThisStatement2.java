package This.Statement;

public class ThisStatement2 {
	int age;
	double salary;
	ThisStatement2(int age){
		this.age=age;
		System.out.println("Age of Javed is "+age);
	}
	ThisStatement2(int age,double salary){
		this(age);
		this.salary=salary;
		System.out.println("Salary of Javed is "+salary);
	}
		void display() {
			System.out.println(age + " " + salary);
		}
		
	

	public static void main(String[] args) {
		System.out.println("Program Start");
		ThisStatement2 l1=new ThisStatement2(20);
		System.out.println(l1.age+"  "+l1.salary);
		ThisStatement2 x1=new ThisStatement2(25, 85000.00);
		System.out.println(x1.age+"  "+x1.salary);
		l1.display();
		x1.display();
	}

}
