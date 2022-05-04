package ThisKeyword;

public class FinalKeyword1 {
	final int speedlimit;
	FinalKeyword1(){
		speedlimit=80;
		System.out.println("Speedlimit: "+speedlimit);
		
	}

	public static void main(String[] args) {
		FinalKeyword1 c1=new FinalKeyword1();
		System.out.println("Speedlimit:"+c1.speedlimit);
		
	}

}
