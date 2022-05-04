package day4.localGlobalvariable;

public class Block {
	static {
		System.out.println("Program start");
	}

	static void reverse(int num, int rev, int rem) {
		int jk=num;
		while(num!=0) {
		 rem=num%10;
		 rev=rev*10+rem;
		 num=num/10;
	
		}
		if (jk==rev) {
			System.out.println("Number is palindrom");
		
		}else {
			System.out.println("Number is not palindrom");
		}
	}

	void reverse1(int num, int rev, int rem) {
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}
		System.out.println("result value: "+rev);
	}

	public static void main(String[] args) {
		Block.reverse(121, 0, 0);
		Block c1=new Block();
		c1.reverse1(12345, 0, 0);

	}
	{
		System.out.println("Result for Reverse Number");
	}

}
