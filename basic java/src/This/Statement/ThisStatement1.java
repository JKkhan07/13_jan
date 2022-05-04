package This.Statement;

public class ThisStatement1 {
	ThisStatement1(){
		this(45.60);
		System.out.println("this is zero param ");
	}
	ThisStatement1(double a){
		this(4);
		System.out.println("this is double  param ");
	}
	ThisStatement1(int b){
		System.out.println("this is int param ");
	}

	public static void main(String[] args) {
		ThisStatement1 s1=new ThisStatement1();
		
	}

}
