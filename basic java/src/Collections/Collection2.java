package Collections;

import java.util.ArrayList;

public class Collection2 {

	public static void main(String[] args) {
		ArrayList<String> a1 =new ArrayList<String>();
		a1.add("Ravi");
		a1.add("Vijay");
		a1.add("Ajay");
		a1.add("Anuj");
		a1.add("Gaurav");
		System.out.println(a1.size());
		System.out.println(a1);
		System.out.println("removing vijay from al:"+a1.remove("Vijay"));
		System.out.println(a1);
		System.out.println("removing index from a1: "+a1.remove(1));
		System.out.println(a1);
		ArrayList<String> a2 =new ArrayList<String>();
		a2.add("Javed");
		a2.add("Jafar");
		a1.addAll(a2);
		System.out.println(a1);
		System.out.println("For removing all element from a2");
		a1.removeAll(a2);
		System.out.println(a1);
		a1.removeIf(str->str.contains("Ajay"));
		System.out.println(a1);
		a1.clear();
		System.out.println(a1);
		

	}

}
