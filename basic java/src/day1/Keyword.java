package day1;

public class Keyword {
	final int empId=90;
	double salary=34400.67;
	void run() {
		System.out.println("empId: "+empId);
	}

		

		public static void main(String args[]) {
			Keyword obj = new Keyword();
			obj.run();
			System.out.println(obj.salary);
		}
	}


