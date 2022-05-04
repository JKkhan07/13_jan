package Collections;

import java.util.ArrayList;

public class Collection3 {

	public static void main(String[] args) {
		ArrayList l1= new ArrayList();
		System.out.println(l1.size());
		System.out.println(l1);
		l1.add("Mango");
		l1.add("Banana");
		l1.add("Grapes");
		l1.add("cherry");
		System.out.println(l1.size());
		System.out.println(l1);
		l1.add(1,"papaya");
		System.out.println(l1);
		ArrayList l2 =new ArrayList();
		l2.add("javed");
		l2.add("Khan");
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		ArrayList l3 = new ArrayList();
		l3.add("John");
		l3.add("Rahul");
		System.out.println(l3);
		l1.addAll(1,l3);
		System.out.println(l1);
		System.out.println(l1.size());
		
	}

}
