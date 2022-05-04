package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add("javed");
		list.add("Pathan");
		list.add("khan");
		list.add("apple");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println("************************");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("************************");
		for(Object jk:list) {
			System.out.println(jk);
		}
		System.out.println("************************");
		list.set(3, "oneplus");
		System.out.println(list);
		System.out.println("Sorting the list");
		Collections.sort(list);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println("************************");
		System.out.println("Traversing list through forEach() method:");
		list.forEach(a->{
			System.out.println(a);
		});
		System.out.println("Traversing list through Iterator interface:");
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());//
	
		
		
	}

}
