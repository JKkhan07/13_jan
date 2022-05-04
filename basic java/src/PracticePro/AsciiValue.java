package PracticePro;

public class AsciiValue {

	public static void main(String[] args) {
		char i='a';
		for (int x1='a'; x1<='z'; x1++) {
			System.out.println(i+"="+x1);
			i++;
		}
		System.out.println("Ascii value for capital letter");
		char j='A';
		for (int z1='A';z1<='Z';z1++) {
			System.out.println(j+"="+z1);
			j++;
		}
	}

}
