package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection4 {

	public static void main(String[] args) {
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("rahul");
		s1.add("Javed");
		s1.add("Pathan");
		s1.add("anmol");
		s1.add("Gopal");
		ArrayList<String> s2=new ArrayList<String>();
		s2.add("Pune");
		s2.add("Mumbai");
		System.out.println(s1);
		System.out.println("*********************");
		System.out.println(s2);
		s1.addAll(s2);
		System.out.println(s1);
		System.out.println("iterating the elements after retaining the elements of al2");
		Iterator itr= s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}System.out.println(itr.hasNext());
		
	}

}
