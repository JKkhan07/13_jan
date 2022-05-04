package day4.localGlobalvariable;

public class Variables {
	int age = 20;
	static char grade;
	double salary = 20000;
	static int empId = 144;
	public static void main(String[] args) {
	int empId = 200;
	System.out.println("empId ="+empId);
	System.out.println("SGV with standard:"+Variables.grade);
	Variables r1=new Variables();
	System.out.println("NSGV with standard:"+r1.age);
	System.out.println("NSGV with standard :"+r1.salary);
	System.out.println("SGV with standard:"+Variables.empId);
	Variables V2=new Variables();
	V2.age=55;
	V2.salary=60000;
	System.out.println("NSGV with standard:"+V2.age);
	System.out.println("NSGV with standard :"+V2.salary);
	System.out.println("NSGV with standard:"+r1.age);
	System.out.println("NSGV with standard :"+r1.salary);

	}

}
