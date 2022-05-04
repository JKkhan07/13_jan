package Arrays;

public class Array4 {
	static int[] getarray() {
		return new int[] {10,20,30,40,50};	
	}
	static int getnum() {
		return(10+30);
	}
	public static void main(String[] args) {
		int arr[]=Array4.getarray();
		for(int i =0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
	}
		System.out.println(Array4.getnum());

	}
}
