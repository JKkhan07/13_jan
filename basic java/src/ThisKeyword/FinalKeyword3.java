package ThisKeyword;

public class FinalKeyword3 {
	int cube(final int n){ 
		System.out.println(n);
		   n=n+2;  
		   return n*n*n;  
		  }

	public static void main(String[] args) {
		FinalKeyword3 b = new FinalKeyword3();
		System.out.println(b.cube(5));
	}

}
