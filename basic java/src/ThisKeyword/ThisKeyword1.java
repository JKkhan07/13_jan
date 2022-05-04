package ThisKeyword;

 class A  {
	void abc() {
		System.out.println("Hello Goodmorning ");
	}
	void efg() {
		this.abc();
		System.out.println("I am Javed");
	}
 }
public class ThisKeyword1 {
	void Methodone() {
		System.out.println("What are You Doing");
	}
	
	void Methodtwo() {
		this.Methodone();
		System.out.println("Good Night ");
	}


	public static void main(String[] args) {
		ThisKeyword1 c1=new ThisKeyword1();
		c1.Methodtwo();
		A a1=new A();
		a1.efg();
		
	}

}
