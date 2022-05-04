package Arrays;

public class Array1 {

	public static void main(String[] args) {
		int[] numbers= {8,9,10,11,12,13,14};
		double sum=0;
		double average;
		for(int num:numbers) {
			sum=sum+num;	
			
		}
		int arraylength=numbers.length;
		average =sum/numbers.length;
		System.out.println("sum: "+sum);
		System.out.println("average: "+average);

}
}
