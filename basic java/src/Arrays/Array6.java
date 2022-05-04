package Arrays;

public class Array6 {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 2, 3 }, { 9, 8, 7, 6 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		char chararr[][]= {{'a','v'},{'q','w','e'},{'z','x','c'}};
		for(int i=0;i<chararr.length;i++) {
			for(int j=0;j<chararr[i].length;j++) {
				System.out.print(chararr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
