package PracticePro;

public class WhileCount {

	public static void main(String[] args) {
		int i=0;
		int j = 0;
		while (j<10) {
			j++;
			System.out.println("number "+j);
			++i;
		}
		System.out.println("Total number is : "+i);
	}

}
