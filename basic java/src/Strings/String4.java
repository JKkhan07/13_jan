package Strings;

public class String4 {

	public static void main(String[] args) {
		// Returns the number of characters in the String.
		String s1 = "corejavabasic";
		System.out.println("actual string: " + s1);
		System.out.println("String length: " + s1.length());
		System.out.println("string char " + s1.charAt(3));
		System.out.println("********************************************");
		// Return the substring from the ith  index character
        // to end of string
		System.out.println("string substring " + s1.substring(2));
		System.out.println("substring from 2 to 5 " + s1.substring(2, 5));
		System.out.println("********************************************");
		// Concatenates string2 to the end of string1.
		String s2 = "core";
		String s3 = "javabasic";
		System.out.println("actual string s2: " + s2);
		System.out.println("actual string s3: " + s3);
		System.out.println("concatenated String: " + s2.concat(s3));
		String x1 = s2.concat(s3);
		String p1 = "pune";
		String p2 = "mumbai";
		String x2 = p1.concat(p2);
		String x3 = x1.concat(x2);
		System.out.println(x3);
		System.out.println("********************************************");
		// Returns the index within the string
        // of the first occurrence of the specified string.
		String s4 = "Learn Share Learn Share";
		System.out.println("Index of 'Share' starts from: " + s4.indexOf("Share"));
		System.out.println("Index of a  = " + s4.indexOf('a', 3));
		System.out.println("Index of e = " + s4.indexOf('e', 11));
		System.out.println("last Index of 'Learn'  = " + s4.lastIndexOf("Learn",18));
		System.out.println("********************************************");
		// Checking equality of Strings
		String s5="Selenium";
        String s6="selenium";
        String s7="Selenium";
        System.out.println("Checking Equality of s5 & s6: " + s5.equals(s6));//
        System.out.println("Checking Equality of s5 & s7: " + s5.equals(s7));//
        System.out.println("Checking Equality of s5 & s6 with Ignore case: " + s5.equalsIgnoreCase(s6));
		System.out.println("********************************************");
		// Converting cases
        String s8="JavaClass";
        System.out.println("converting cases: "+s8.toLowerCase());
        System.out.println("converting cases: "+s8.toUpperCase());
		System.out.println("********************************************");
        // Trimming the word
        String a1="  javabasic  ";
        System.out.println(a1.length());
        System.out.println("Removing the space: "+a1.trim());
        System.out.println(a1.trim().length());
		System.out.println("********************************************");
		// Replacing characters
        String a2="javacorebasic";
        System.out.println("Orignal string: "+a2);
        System.out.println(a2.replace("a","y"));
        String a3=a2.replace("java", "net");
        System.out.println("replaceing: "+a3);
        String a6=a2.replaceFirst("a", "g");
        System.out.println("Replace first: "+a6);
		System.out.println("********************************************");
        String a4=" ";
        System.out.println("String a4 is empty or not: "+a4.isEmpty());
        String a7=new String();
        System.out.println("String a7 is empty or not: "+a7.isEmpty());

	}

}
