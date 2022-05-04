package Collections;

import java.util.ArrayList;
import java.util.Collections;


public class Collection5 {

	public static void main(String[] args) {
		ArrayList<Integer> q1=new ArrayList<Integer>();
		q1.add(123);
		q1.add(456);
		q1.add(45);
		q1.add(98);
		System.out.println(q1.size());
		System.out.println(q1);
		Collections.sort(q1);
		System.out.println(q1);
		Collections.reverse(q1);
		System.out.println(q1);

	}

}
