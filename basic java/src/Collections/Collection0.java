package Collections;

import java.util.ArrayList;


public class Collection0 {

	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add("javed");
		list.add(123);
		list.add("Banana");
		list.add(null);
		list.add("");
		list.add(true);
		list.add('Z');
		list.add(new Collection0());
		System.out.println(list.size());
		System.out.println(list);
		System.out.println("Traversing list through for loop:");
		for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
		System.out.println("************************");
		for(Object jkr:list) {
			System.out.println(jkr);
		}
		System.out.println(list.get(1));
		System.out.println("************************");
		list.set(1,"Pathan");
		System.out.println(list);
	}
}
