package Strings;

public class String0 {

	public static void main(String[] args) {
		String0 c1=new String0();
		System.out.println("c1: "+c1);
		String s1="dubai";
		String s2="Pune";
		String s3="dubai";
		System.out.println("********************************");
		System.out.println("String s1: "+s1);
		System.out.println("String s2: "+s2);
		System.out.println("String s3: "+s3);
		System.out.println("********************************");
		System.out.println("string s1 length: "+s1.length());
		System.out.println("string s2 length: "+s2.length());
		System.out.println("string s3 length: "+s3.length());
		System.out.println("********************************");
		System.out.println("s1 is equal to s3: "+s1.equals(s3));
		System.out.println("s1 is equal to s3: "+s1.equals(s2));
		System.out.println("s1 is equal to s3: "+(s1==s3));
		System.out.println("********************************");
		String s4=new String("dubai");
		System.out.println("s4: "+s4);
		System.out.println("s1 is equal to s3: "+s1.equals(s4));
		System.out.println("s1 is equal to s4: "+(s1==s4));


		
	}

}
