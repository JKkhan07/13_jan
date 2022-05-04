package ThisKeyword;

public class ThisKeyword2 {
	void m() {
		System.out.println("this keyword pointing to: " + this);// prints same reference ID
	}

	public static void main(String[] args) {
		ThisKeyword2 obj = new ThisKeyword2();

		System.out.println("obj pointing to: " + obj);// prints the reference ID
		obj.m();
	}

}
