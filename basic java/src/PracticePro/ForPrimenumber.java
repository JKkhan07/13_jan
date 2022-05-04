package PracticePro;

public class ForPrimenumber {

	public static void main(String[] args) {
		for (int i=1; i<=50; i++) {
			int count=0;
		for (int num=i; num>=1; num--) {
			if (i%num==0) {
				count=++count;
				
			}
		}
		if (count==2) {
			System.out.println("prime number "+i);
			
		}
		
			
		}
	}

}
