package p1;//Packages name should not start with number as Error

import java.util.ArrayList;

/*
 * Arrays 
 * dis:
 * 1. It searches for mem which is continous, it can't use memory which is in split. So,mem efficiency not good.
 * 			AND so data structure was introduced to make memory efficiency better
 * 			
 * 	Data structure is a concept that helps me to store data by using the data more efficiently which array can't
 * 
 * 		e.g. Array can't use this type of mem
 * 				int[] a = new int[3];
 * 				|x| |x| |
 * 			whereas DS will use this mem even if the mem is in split by joining it
 * 
 * 2. Mem is not dynamic
 * 		e.g. if int[] a = new int[3] then to int[] a = new int[4]
 * 			
 * 			* the dis is it will destroy the previous mem to create new one OR even if reduced size it not 
 * 			delete but destroy and recreate. 
 * 			e.g. to int[] a = new int[2]
 * 			and so it will reduce efficiency
 * 3. To search we have to build logic but in collections it is readily available.
 * 
 * 
 * DAtaStructure in java is called as Collection (ready made);
 * adv: 1. dynamic array
 * 		2. heterogeneous data(using excel)
 * 		3. undelying DS (every collection has got predefined DS which is dynamic in case of ArrayList)
 * 
 * 
 * Dynamic array: it is one whose mem auto increases decreases depending on the data.
 * 						
 * 						=================
 * 						|				|
 * 						|				|
 * 						|				|
 * 						|	object		| <------object behaves as dynamic array
 * 						|				|
 * 						|				|
 * 						=================
 * 
 * Diff b/w Arrays and Collection
 * 			Array				|		Collection
 * ======================================================================
 * 1. It is fixed in size		| 1. size of the collection is dynamic
 * 2. It can store only homo 	| 2. Can store both homo and hetero data
 * 	data						| 
 * 3. It terms of mem usage it  | 3. It terms of mem usage it is more
 * 	is less efficient			|	efficient
 * 4. No underlying data 		| 4. has got underlying data structure to 
 * 	structure					|	simplify our work
 * 	
 * 
 * ====
 * 				All are interfaces here
 * 						
 * 						Iterable					^
 * 							|						|
 * 							|
 * 							|						|
 * 							$
 * 						Collection				   ^^
 * 							|					   ||  extends
 * 							|					   ||
 * 							$					   ||
 * 		============================================
 * 		|			 		|			 			|
 * 		|			 		|			 			|
 * 		$			 		$			 			$
 * 	   List				  Queue					   Set
 * 	 ==============			|				===================
 * 	 |			  |			|				|				  |
 * 	 |		  	  |			|				|				  |	=====> From here all are classes with 
 * 	 $		  	  $			$				$				  $			implementation of parent interface
 * ArrayList   LinkedList PriorityQueue	  TreeSet			HashSet
 * 
 * Note: 1. List: duplicate and [sequential] e.g. Contacts
 * 		 2. Queue: [FIFO] e.g. ticketbooking
 * 		 3. Set: No duplicate e.g. whatsapp [group] or Team India
 * 
 * Collection
 * 	1. Collection is an interface	
 * 	2. Collection gives us a readymade datastructure
 *  3. Collections can't work w/o Collection.
 * 	
 */
public class A {
public static void main(String[] args) {
	ArrayList a = new ArrayList(); //NO WARNING as accepting any object and here using 1.4 jDK so no type check
	a.add(Integer.valueOf(10));
	a.add("pankaj");
	a.add(Double.valueOf(10.3));
	System.out.println(a);
}
}
