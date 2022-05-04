package Arrays;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		int arr[] = { 33, 3, 4, 5 };
		System.out.println("Printing original array:");
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("Printing clone of the array:");
		int carr[] = arr.clone();
		for (int i : carr) {
			System.out.println(i);
		}
		System.out.println("Are both equal?");
		System.out.println(Arrays.equals(arr, carr));
		System.out.println("******************************");
		int copyArr[] = Arrays.copyOf(arr, arr.length);
		for (int i : copyArr) {
			System.out.println(i);
		}
		System.out.println("***************");
		int copyArrs[] = Arrays.copyOfRange(arr, 0, 2);
		for (int i : copyArr) {
			System.out.println(i);
		}
		System.out.println("******************************");
		Arrays.sort(arr);
		System.out.println("After sorting original array:");
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
