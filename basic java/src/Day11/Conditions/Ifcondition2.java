package Day11.Conditions;

public class Ifcondition2 {

	public static void main(String[] args) {
		int age = 17;
		int weight = 51;
		if (age>18) {
		if (weight > 50) {
			System.out.println("you are eligible to donate blood");
		}else {
			System.out.println("You are not eligible for donate blood,as your weight below 50");
		}
		}else {
			System.out.println("you are not eligible for donate blood,as your age below 18");
		
		}
	}

}
