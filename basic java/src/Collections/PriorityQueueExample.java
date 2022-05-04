package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue q1 = new PriorityQueue();
		System.out.println(q1);
		q1.add(123);		
		q1.add(568);
		q1.add(476);
		q1.add(13);
		q1.add(23);
		System.out.println(q1.size());
		System.out.println(q1);
		System.out.println("Queue Element: "+q1.element());
		System.out.println("Queue peak: "+q1.peek());
		Iterator itr = q1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Eleements of Queue: " + q1);
		System.out.println("removing Queue: "+q1.remove());
		System.out.println("removing Queue by using poll(): "+q1.poll());
		System.out.println("Eleements of Queue: " + q1);
		q1.forEach(jk -> {
			System.out.println(jk);
		});

	}

}
