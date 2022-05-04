package Arrays;

public class Array3 {
	static void min(int ar[]) {
		int min=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(min>ar[i]) {
				min=ar[i];
			}
		}
		System.out.println("min nember in array "+min);
	}
	static void max(int ar[] ){
		int max=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(max<ar[i]) {
				max=ar[i];
			}
		}
		System.out.println("max number in array "+max);
	}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		Array3.min(a);
		Array3.max(a);
	}

}
