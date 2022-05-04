package Inheritance;
class Grandfather{
	Grandfather(){
		System.out.println("I am the Grandfather of class ");
		
	}
	void leader() {
		System.out.println("I am the leader of home");
	}
}
class Father extends Grandfather {
	Father(int j){
		super();
		System.out.println("I am the father of class");
		
	}
	void SubLeader() {
		System.out.println("I am the Subleader of the home ");
	}
}
class child extends Father {
	child(double d){
		super(15);
		System.out.println("I am the child of the class ");
	}
	void child() {
		System.out.println("I am the child of the home ");
	}
}

public class Inheritance5 {

	public static void main(String[] args) {
		child c1=new child(14.45);
		c1.child();
		c1.SubLeader();
		System.out.println("**********************");
		Father s1=new child(14);
		s1.leader();
		System.out.println("**********************");
		Grandfather g1=new child(14.2);
		g1.leader();
		
	}

}
