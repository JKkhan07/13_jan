package Collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Renna");
		l1.add("Mishra");
		l1.add("Yash");
		System.out.println("names in l1:"+l1);
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("Javed");
		l2.add("Khan");
		System.out.println("names in l2: "+l2);
		l1.addAll(l2);
		System.out.println(l1);
		LinkedList<String> l3 = new LinkedList<String>();
		l3.add("John");
		l3.add("Rahul");
		l1.addAll(0, l3);
		System.out.println(l1);
		l1.addFirst("zeenat");
		System.out.println(l1);
		l1.addLast("Azan");
		System.out.println(l1);

	}

}
