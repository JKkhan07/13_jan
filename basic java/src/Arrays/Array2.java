package Arrays;

public class Array2 {

	public static void main(String[] args) {
		int[] age= {10, 40, 30, 55, 65};
		System.out.println("Total number of age count: "+age.length);
		System.out.println("****for-loop******");
		for (int i = 0; i < age.length; i++) {
			//System.out.println(age[i]);
			if(age[i]==55) {
			System.out.println(age[i]);
			break;
			}else {
		System.out.println("age is not 55");
		}
		}
			System.out.println("****for-loop******");
			for(int xyz:age) {
				//System.out.println(xyz);
				if(xyz==65) {
					System.out.println("Age is "+xyz);
				}else {
					System.out.println("age is not "+xyz);
					
				}
				
			}
				
		
	}

}
