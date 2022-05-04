package Abstract;
abstract class bike{
	 abstract void run ();
	 public void speed(int spd) {
		 System.out.println("speed of the bike: "+spd);
	 }
	
}
class honda extends bike {

	void run() {
		System.out.println("running safely");
	}
	public void speed(int spd) {
		System.out.println("speed of the honda bike: "+spd);
		super.speed(95);
	}
	
	void colour() {
		System.out.println("Colour of the bike is black ");
	}
	
}

public class Abstract1 {

	public static void main(String[] args) {
		honda h1=new honda();
		h1.speed(55);
		h1.run();
		bike b1=new honda();
		b1.run();
	}

}
