package Constructor;

class abc {
	int age=25;
	abc(){
		System.out.println("My name is Javed ");
	}
	void print() {
		System.out.println("I am from beed");
	}
}
 class xyz {
	 int age=30;
	 xyz(){
		 System.out.println("my name is rahul ");
	 }
	 void display() {
		 System.out.println("I am from pune ");
		 
	 }
	
}
 
 public class Constructor3{
	 void display() {
		 System.out.println("we all are doing Engg");
	 }
	 
	public static void main(String[] args) {
		System.out.println("Program start");
		abc c1=new abc();
		c1.print();
		System.out.println("and my age "+c1.age);
		System.out.println("******************");
		xyz x1=new xyz();
		x1.display();
		System.out.println("and my age "+x1.age);
		Constructor3 s1=new Constructor3();
		s1.display();
		
		
	}

}
