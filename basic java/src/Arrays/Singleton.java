package Arrays;

public class Singleton {
	
	private Singleton(){
		System.out.println("simpleton class cons");
	}
	static Singleton c1=new Singleton();
	public static Singleton getobj() {
		return c1;
	}
	void display() {
		System.out.println("I am display");
	}

	public static void main(String[] args) {
		//Singleton s1=new Singleton();
		Singleton.getobj().display();
		Singleton s2=Singleton.getobj();
		s2.display();
	}

}
/**
 * 1. constructor should be private
 * 2. create static ref variable of the class
 * 3. create static method which return current class object
 */