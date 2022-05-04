package day1;
class cons2 {
static int age;
double salary;


cons2() {
	System.out.println("============Zero- Parameterized Constructor started============");
	System.out.println(" having no parameters");
	System.out.println("============Zero- Parameterized Constructor Ends....============");	
}	
cons2(int a) {
	System.out.println("============int Parameterized Constructor started============");
	System.out.println(" having int parameters");
	age=a;
	System.out.println("============int Parameterized Constructor Ends....============");
}
cons2(double b) {
	System.out.println("============double Parameterized Constructor============");
	System.out.println(" having double parameters");
	salary=b;
	System.out.println("============double- Parameterized Constructor Ends....============");
}

cons2(int a, double b) {
	System.out.println("============int-double Parameterized Constructor started============");
	System.out.println(" having int-double parameters");
	age=a;
	salary=b;
	System.out.println("============int-double Parameterized Constructor Ends....============");
}

public static void main(String args[]) {
	cons2 pc1 = new cons2();
	System.out.println("After Zero-para constructor,Age= "+cons2.age);
	System.out.println("After Zero-para constructor,Salary= "+pc1.salary);		
	
	cons2 pc2 = new cons2(33);
	System.out.println("After int-para constructor,Age= "+cons2.age);
	System.out.println("After int-para constructor,Salary= "+pc2.salary);
	
	cons2 pc3 = new cons2(34000.34);
	System.out.println("After double-para constructor,Age= "+cons2.age);
	System.out.println("After double-para constructor,Salary= "+pc3.salary);
	
	cons2 pc4 = new cons2(30,95000.34);
	System.out.println("After int-double-para constructor,Age= "+cons2.age);
	System.out.println("After int-double-para constructor,Salary= "+pc4.salary);
	
	
}
	}




