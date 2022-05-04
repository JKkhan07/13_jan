package Strings;

public class String1 {

	public static void main(String[] args) {
		String temp = "";
		String s1 = "javedkhan";
		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));

		}
		System.out.println("********************************");

		for (int i = s1.length() - 1; i >= 0; i--) {
			// System.out.println(s1.charAt(i));
			temp = temp + s1.charAt(i);

		}
		System.out.println("temp: " + temp);
		System.out.println("s1: " + s1);
	
//	for(int i=0;i<=s1.length();i++) {
//		System.out.println(s1.charAt(i));
//	}
	}
}
