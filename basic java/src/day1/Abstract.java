package day1;
abstract class kasam{
	abstract void member();
		void house() {
			System.out.println("I am also owner of the house ");
		}
	}
class jafar extends kasam{
	void member() {
		System.out.println("I am the Member of this house ");
	}
	void display() {
		System.out.println("i am also owner of this house ");
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		jafar j1 = new jafar();
		j1.house();
		j1.display();
		j1.member();
		System.out.println("*****************************");
		kasam k1 = new jafar();
		k1.house();
		
		

	}

}
