package day1;

public class SwitchCase1 {
	public static int checkConsCt(char start,char ends) {
		int ct=0;
		for(char c1=start;c1<=ends;c1++) {
			if(!(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')) {
				ct=ct+1;
			}
		}
		return ct;
	}
	public static int checkVowelsCt(char start,char ends) {
		int ct=0;
		for(char c1=start;c1<=ends;c1++) {
			if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u') {
				ct=ct+1;
			}
		}
		return ct;
	}

	public static void main(String[] args) {
		System.out.println("cons ct: "+checkConsCt('a', 'z'));
		System.out.println("check vowel: "+checkVowelsCt('a','z'));
		
	}

}
