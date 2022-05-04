package Strings;

public class String2 {

	public static void main(String[] args) {
		String s1="I am javed";
		System.out.println("s1: "+s1);
		String [] st1=s1.split(" ");
		for(String s:st1) {
			System.out.println(s);
		}
		System.out.println("********************************");
		String s2="I am from beed";
		System.out.println("actual string: "+s2);
		String[] st2=s2.split(" ",2);
		for(String d:st2) {
			System.out.println(d);
		}
		System.out.println("********************************");
		String s3="I am from pune";
		System.out.println("Actual string: "+s3);
		String[] st3=s3.split(" ");
		String temp=" ";
		for(int i=s3.length()-1;i>=0;i--) {
		temp=temp+s3.charAt(i);
		
		
		}
		System.out.println("Reverse : "+temp);
		System.out.println("**********************");
		String s4="    I am Jk      ";
		System.out.println("Actual String: "+s4);
		System.out.println("Actual string length: "+s4.length());
		System.out.println("Actual String without spaces: "+s4.trim());
		System.out.println("Actual String without spaces: "+s4.trim().length());
		System.out.println("**********************");
		String s5="i    am    khan    ";
		System.out.println("actual string: "+s5);
		System.out.println("actual string length: "+s5.length());


	}

}
