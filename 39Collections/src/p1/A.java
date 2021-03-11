package p1;

import java.util.LinkedHashSet;
import java.util.PriorityQueue;

/*
 * PRIORITY QUEUE (NOt Follow FIFO)
 * 	3. Queue: The queue interface basically orders the element in FIFO manner
 * 		
 * 		3.1 Priority Queue:
 * 			* The priority queue class provides the faciltiy of using queue.
 * 			* But it does not orders the elements in FIFO manner
 * 
 * 	FRAMEWORK: readily avalilabe For usage
 * 	API: Collection of JAR's
 * 
 * Q. Diff b/w collection and Collections?
 * Q. Diff b/w List, Queue, Set?
 * Q. What is Vector?
 * 
 */
public class A {
public static void main(String[] args) {
	PriorityQueue q = new PriorityQueue();
	initializeCollection(q);
	
	System.out.println(q); // [10, 20, 100, 45]
	
	// POLL: reads an ele to transfer the call to next ele and stops and is called as polling()
	System.out.println(q.poll()); //10
	System.out.println(q.poll()); //20
	System.out.println(q.poll()); //100
	System.out.println(q.poll()); //45
	System.out.println(q.poll()); //NULL
	System.out.println(q); // []
	
	// same O/P as transfer to the next ele is not transfered
	initializeCollection(q);
	
	System.out.println("Before using poll: \n"+q.peek()); //10
	System.out.println(q.peek()); //10
	System.out.println(q.peek()); //10
	System.out.println(q.peek()); //10
	
	// to get out of this peek of 10 use poll to transfer the call to next ele
	System.out.println("After using poll: \n"+q.peek()); //10
	q.poll();
	System.out.println(q.peek()); //20
	q.poll();
	System.out.println(q.peek()); //45
	q.poll();
	System.out.println(q.peek()); //100
	
	//ALL IN oNe e.g.
	initializeCollection(q);
	System.out.println(q.contains(Integer.valueOf(100))); //true
	q.remove(Integer.valueOf(45));
	System.out.println(q); // [10, 20, 100]
	q.removeAll(q);
	System.out.println(q); // []
//	q.remove(); // EXCEPTION NOSuchElementException removes the first ele i.e. 10
	System.out.println(q);//[]
	
	q.add(Integer.valueOf(78));
	System.out.println(q.offer(Integer.valueOf(55)));
	//	Inserts the specified element into this priority queue.
	System.out.println(q); //[55]
	

	//System.out.println(q.get()); //ERROR as get not in queue similarly for Queue, hashset and treeSet and LinkedHashSet 
	LinkedHashSet hashSet = new LinkedHashSet();
	hashSet.add(Integer.valueOf(100));
	hashSet.add(Integer.valueOf(10));
	hashSet.add(Integer.valueOf(2));
	hashSet.add(Integer.valueOf(3));
	hashSet.add(Integer.valueOf(4));
	System.out.println(hashSet);
	//hashSet.get();//ERROR as get() ledu
}

private static void initializeCollection(PriorityQueue q) {
	q.removeAll(q);
	q.add(Integer.valueOf(10));
	q.add(Integer.valueOf(45));
	q.add(Integer.valueOf(100));
	q.add(Integer.valueOf(20));
}
}
