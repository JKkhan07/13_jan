package Day11.Conditions;

public class Forloop2 {

	public static void main(String[] args) {
		for (char c1='a'; c1<='z'; c1++) {
			System.out.println(c1);
		}
		for (char c1='A'; c1<='Z';c1++) {
			System.out.println("capital : "+c1);
		}
		for (char c2='Z'; c2>='A'; c2--) {
			System.out.println("reverse :"+c2);
		}

	}

}
