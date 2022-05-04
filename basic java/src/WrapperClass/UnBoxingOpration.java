package WrapperClass;

public class UnBoxingOpration {

	public static void main(String[] args) {
		Double d1=40000.45;
		System.out.println("d1: "+d1);
		Double salary=d1.doubleValue();
		System.out.println("salary: "+salary);
		System.out.println("d1==salary: "+(d1==salary) );

	}

}
