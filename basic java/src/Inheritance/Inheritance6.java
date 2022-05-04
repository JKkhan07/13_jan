package Inheritance;
class collage{
	int collagefee=30000;
	collage(){
		System.out.println("collage cons");
	}
		public void display() {
			System.out.println("collage is near my house");
			
		}
	}
class tusion extends collage {
	double tusionfee=15000;
	tusion (){
		System.out.println("tusion cons");
	}
	public void print() {
		System.out.println("tusion is also is near my house");
		System.out.println("friut quantity: "+collagefee);
		System.out.println("apple quantity: "+tusionfee);
		
	}
	public void jk() {
		System.out.println("tusoin fee is less than collage fee");
		super.display();
	}
	
}


public class Inheritance6 {
	public static void main(String[] args) {
		tusion t1=new tusion();
		t1.display();
		t1.print();
		t1.jk();
		System.out.println("*******************");
		collage c1=new tusion();
		c1.display();
		

	}
}
