package Collections;

import java.util.Vector;

public class VectorExample2 {

	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		System.out.println("capacity :"+v1.capacity());
		v1.add("javed");
		v1.add("khan");
		v1.add("Pathan");
		System.out.println("Total name: "+v1);
		v1.addElement("jk");
		System.out.println("Total Element: "+v1);
		System.out.println("capacity :"+v1.capacity());
		for(String name:v1) {
			System.out.println(name);
		}

	}

}
