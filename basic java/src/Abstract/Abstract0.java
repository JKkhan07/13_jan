package Abstract;
abstract class animal{
	public abstract void animalsound();
	public void sleep() {
		System.out.println("ZZZZZ");	
	}
}
class pig extends animal {
	
	public void animalsound() {
		System.out.println("the pig says: wee wee ");
	}
}
class dog extends animal{
	public void animalsound() {
		System.out.println("dog says; bhaw bhaw ");
	}
}


public class Abstract0 {

	public static void main(String[] args) {
		pig p1=new pig();
		p1.animalsound();
		p1.sleep();
		dog d1=new dog();
		d1.animalsound();
		d1.sleep();
	}

}
