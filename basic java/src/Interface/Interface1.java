package Interface;

interface Printable1 {
	void print();
}
interface Showable1 {
	void print();
}
class Interface1 implements Printable1, Showable1 {
	public void print() {
		System.out.println("Hello");
	}
	public static void main(String args[]) {
		Interface1 obj = new Interface1();
		obj.print();
		Showable1 obj1 = new Interface1();
		obj1.print();
		Printable1 obj2 = new Interface1();
		obj2.print();
	}
}
