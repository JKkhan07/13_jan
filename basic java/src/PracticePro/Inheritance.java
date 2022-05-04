package PracticePro;

class company{
	double salary;
	int Empid;
	company(int Empid){
		this.Empid=Empid;
		System.out.println(Empid+"   "+salary);
	}
	company(int Empid,double salary){
		this(123);
		this.salary=salary;
		System.out.println(Empid+"  "+salary);
	}
	 
}
class employee{
	
}

public class Inheritance {

	public static void main(String[] args) {
		//company c1=new company(123);
		//System.out.println(c1.Empid+"   "+c1.salary);
		System.out.println("**************************8");
		company d1=new company(456,46000.0);
		//System.out.println(d1.Empid+"  "+d1.salary);
		
		
		

	}

}
