package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		Set<String> set = new HashSet<String>();
		// in set if you try to add duplicate element dn it will neglect that element
		// instead of throwing an error
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");// it don't get added in set
		set.add("Ajay");
		System.out.println("After invoking remove(object) method: " + set);
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("removing Ravi from set: " + set.remove("Ravi"));
		System.out.println("After invoking remove(object) method: " + set);
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		System.out.println(set1);
		set.addAll(set1);
		System.out.println(set);
		set.removeAll(set1);
		System.out.println(set);
		set.removeIf(str->str.contains("Vijay"));
		System.out.println(set);
		set.clear();
		System.out.println(set);

	}
}
