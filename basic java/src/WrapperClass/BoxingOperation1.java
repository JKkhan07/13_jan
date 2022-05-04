package WrapperClass;

public class BoxingOperation1 {

	public static void main(String[] args) {
		char c='A';
		Character c1=new Character(c);
		System.out.println("c==c1: "+(c==c1));
		Character c2=new Character('Z');
		System.out.println("vaule of c2: "+c2);
		Character c3='J';
		System.out.println("vaule of c3: "+c3);
		Boolean b=true;
		Boolean b1=new Boolean(b);
		System.out.println("b==b1: "+(b1==b));
		
		

	}

}
