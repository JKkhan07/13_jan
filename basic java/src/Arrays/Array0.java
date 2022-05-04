package Arrays;

public class Array0 {

	public static void main(String[] args) {
		int[] num;
		num=new int [4];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		System.out.println("array element count: "+num.length);
		
		for(int i=0; i<num.length ;i++) {
			System.out.println(num[i]);
		}
		System.out.println("****for-each-loop******");
		for(int number:num) {
			System.out.println(number);
		}
		System.out.println("****for-each-loop******");
		int[]getarray=new int[] {10,20,30,40,60,70};
		for(int jk:getarray) {
			System.out.println(jk);
		}
		
		

	}

}
