package Constructor;

public class Constructor7 {
	static int age = 25;
	double salary=45000;
	Constructor7() {
		System.out.println("============Zero- Parameterized Constructor started============");
		System.out.println(" having no parameters");
		System.out.println("============Zero- Parameterized Constructor Ends....============");	
	}	
	Constructor7(int a) {
		System.out.println("============int- Parameterized Constructor started============");
		System.out.println(" having no parameters");
		age=a;
		System.out.println("============int- Parameterized Constructor Ends....============");	
	}	
	Constructor7(int a, double b) {
		System.out.println("============int and double- Parameterized Constructor started============");
		System.out.println(" having no parameters");
		salary=b;
		System.out.println("============int and double- Parameterized Constructor Ends....============");	
	}	
	Constructor7(double a, int b) {
		System.out.println("============double and int- Parameterized Constructor started============");
		System.out.println(" having no parameters");
		salary=b;
		System.out.println("============double and int- Parameterized Constructor Ends....============");	
	}	

	public static void main(String[] args) {
		Constructor7 c1=new Constructor7();
		System.out.println("After Zero-para constructor,Age= "+c1.age);
		System.out.println("After Zero-para constructor,Salary= "+c1.salary);		
		Constructor7 s1=new Constructor7(20);
		System.out.println("After int-para constructor,Age= "+s1.age);
		System.out.println("After int-para constructor,Salary= "+s1.salary);		
		Constructor7 x1=new Constructor7(30);
		System.out.println("After int and double-para constructor,Age= "+x1.age);
		System.out.println("After int and double-para constructor,Salary= "+x1.salary);		
		Constructor7 j1=new Constructor7(20,85000.2);
		System.out.println("After double and int-para constructor,Age= "+s1.age);
		System.out.println("After double and int-para constructor,Salary= "+s1.salary);		
		

	}

}
