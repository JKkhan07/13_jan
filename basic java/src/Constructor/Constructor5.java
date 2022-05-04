package Constructor;
class G {
	int i = 10;

	G() {
		System.out.println("Running Class B constructor..");
		i = 23;
	}
}

public class Constructor5 {

	public static void main(String[] args) {
		System.out.println("Main() of Class Constructor is started...");
		G b1 = new G();
		System.out.println("Class B global varibale i = " + b1.i);
		System.out.println("======================================");
		G b2 = new G();
		System.out.println("Class B global varibale i = " + b2.i);
		System.out.println("Main() of Class Constructor is ends here...");
	}

}
