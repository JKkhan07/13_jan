package day4.localGlobalvariable;

public class StaticGlobalVariable {
	static int age = 30;
	public static void main(String[] args) {
		System.out.println("program start.........");
		System.out.println("SGV "+ age);
		System.out.println("SGV with standard:"+StaticGlobalVariable.age);
		age = 22;
		System.out.println("SGV: "+age);
		System.out.println("SGV with standard" +StaticGlobalVariable.age );
		int age = 40;
		System.out.println("local vairable: " +age);
		System.out.println("SGV with Standard:" +StaticGlobalVariable.age);
		System.out.println("program End................. ");
		
	}

}

