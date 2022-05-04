package Arrays;

public class Array7 {

	public static void main(String[] args) {
		char[] copyFrom= {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i'};
		char[]copyTo=new char[5];
		System.arraycopy(copyFrom,2,copyTo,0, copyTo.length );
		for(int i=0;i<copyTo.length;i++) {
		System.out.println(copyTo[i]);
	}
		//System.out.println(String.valueOf(copyTo));
	}

}
