package This.Statement;

public class ThisStatement {
	ThisStatement()
	{
	 this(10,45.2);
		System.out.println("******Zero-Param*********");
	}
	ThisStatement(int a)
	{
	
		System.out.println("******int-Param*********");
	}
	ThisStatement(int a, double b)
	{
	this(10);
		System.out.println("******int and double-Param*********");
	}
	public static void main(String[] args) {
		ThisStatement c1=new ThisStatement();
	}

}
