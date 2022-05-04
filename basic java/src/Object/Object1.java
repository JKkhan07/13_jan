package Object;
class Demo{
	void display() {
		System.out.println("I am display()..");
	}
}
public class Object1 extends Demo{

	static int last_roll = 100;
	int roll_no;

	// Constructor
	Object1()
    {
        roll_no = last_roll;
        last_roll++;
    }
	


	public static void main(String[] args) {
		Object1 s = new Object1();

		// Below two statements are equivalent
		System.out.println(s);//s.toString() -->string representation of an object
		System.out.println(s.toString());//string representation of an object
		Demo d1=new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());		
		Demo d2=new Object1();
		System.out.println(d2);
	}

}
