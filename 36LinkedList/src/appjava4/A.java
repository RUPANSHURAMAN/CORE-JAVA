package appjava4;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * LinkedList is of two types:
 * 		1. Singly LL
 * 		2. Doubly LL
 * 
 * 1. Singly LL: Here traversal to read the data happens only in one direction and hence its called as singly
 * 					LinkedList
 * 
 * 		e.g. 1. SINGLY: not in LINKEDLIST class
 * 
 * 			X=> OCCUPIED MEm
 * 
 * 												RAM
 * 					++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * 					|		|		|		|		|		|		|		| 		     |
 * 					|	40	|	104	|	X	|	60	|	107	|	X	|	90	| ROOTED=||  |
 * 					|		|		|		|		|		|		|		| 		 ||  |
 * 					+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++||+++
 * 			MEM ADDR	101		102		103		104		105		106		107		108	 ||
 * 																				    =NULL=
 *  																			     ===
 *   																			      =
 *   
 *     2. DOUBLY: present in LinkedList class, here reading of data can be done in both the direction.
 *     e.g.
 * 			X=> OCCUPIED MEm
 * 
 * 											RAM with MEM ADDR below cells
 * 			++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * 			|		|		|		|		|		|		|		|		|		|		| 		     |
 * 	   ||======NULL	|	40	|	106	|	X	|	102	|	90	|	109	|	X	|	106	|	100	| ROOTED=||  |
 * 	   ||	|		|		|		|		|		|		|		|		|		|		| 		 ||  |
 * 	   ||	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++||+++
 * 	   ||		101		102		103		104		105		106		107		108		109 	110		111	 ||
 * 	   ||																					         ||
 * 	   ||																		    			   =NULL=
 *   =NULL=																		     				===
 *    ===																		      				 =
 *     =
 *     		1.2Linked List
 *     			* Can contain dup data
 *     			* maintains insertion order
 *     			* It's internally implemented as doubly linked list
 */

public class A {
	public static void main(String[] args) {
		LinkedList a = new LinkedList();
		a.add(10);
		a.add("testing");
		a.add(10.3);
		System.out.println(a);
		
		
		// ITERATOR: hasNext() and next() to fetch values
		Iterator itr = a.iterator();
		while (itr.hasNext()) { //check if next step
			System.out.println(itr.next()); //goes to next step
		}
		
		//ALL IN ONE e.g.
		System.out.println("\n\n"+a.contains(10));
		a.remove(1); //remove ele at index 1
		System.out.println(a.size());
		a.removeAll(a);
		System.out.println(a);
		
		// SORTING
		a.add(10);
		a.add(5);
		a.add(1090);
		Collections.sort(a);
		System.out.println("\n"+a);
		
		// Searching only after sorting
		int index = Collections.binarySearch(a, 10);
		System.out.println("\n"+a.get(index));
		
		a.addFirst(45);
		System.out.println(a);//[45, 5, 10, 1090]
		
		a.addLast(65); //ADDLAST OF (E e)
		System.out.println(a);//[45, 5, 10, 1090, 65]
		
		System.out.println(a.element());//45 //Retrieves, but does not remove, the head (first element) of this list.
		System.out.println(a.getFirst());//45
		System.out.println(a.getLast());//65
		
		System.out.println(a.indexOf(10)); //2
		System.out.println(a.lastIndexOf(10)); //2
		
		System.out.println(a.offer(109)); //Adds the specified element as the tail (last element) of this list.
		System.out.println(a); //[45, 5, 10, 1090, 65, 109]
		
		System.out.println(a.offerFirst(78)); //Adds the specified element at the front of list.
		System.out.println(a);//[78, 45, 5, 10, 1090, 65, 109]
		
		System.out.println(a.offerLast(15)); //Adds the specified element at the end of list. OFFER OF (E e)
		System.out.println(a);//[78, 45, 5, 10, 1090, 65, 109, 15]
		
		System.out.println(a.peek());//78 //Retrieves, but does not remove, the head (first element) of this list.
		System.out.println(a.peekFirst());//78 //Retrieves, but does not remove, the first element of this list, or returns null if this list is empty. //
		System.out.println(a.peekLast());//15
		
		System.out.println(a.poll());//78 //Retrieves and removes the head (first element) of this list.
		System.out.println(a.pollFirst());//45
		System.out.println(a.pollLast());//15
		System.out.println(a.pop());//5 //Pops an element from the stack represented by this list.
		
		a.push(89);//Pushes an element onto the stack represented by this list void return
		System.out.println(a);//[89, 10, 1090, 65, 109]
		
		a.removeFirst(); //Removes and returns the first element from this list.
		System.out.println(a);//[10, 1090, 65, 109]
		
		a.removeFirstOccurrence(1090); //Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
		System.out.println(a); //[10, 65, 109]
		
		a.removeLast();//Removes and returns the last element from this list.
		System.out.println(a);//[10, 65]
		
		a.removeLastOccurrence(10);
		System.out.println(a); //[65]
		
		a.set(0, 100);
		System.out.println(a);//[100]
		
		a.add(84);		
		Iterator iterator = a.descendingIterator();
//		a.add(84); //EXCEPTION if written here as ConcurrentModification is done! 
		while (iterator.hasNext()) {
			System.out.println(iterator.next());// 84 100
		}
	}
}
