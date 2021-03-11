package p1;

import java.util.TreeMap;

//Map
public class B {
	public static void main(String[] args) {
		TreeMap m = new TreeMap();
		initializeCollection(m);
		
		System.out.println(m); //{akash=sharma, gautam=rao, rupanshu=ram, sai=verma}
		
		// POLL: reads an ele to transfer the call to next ele and stops and is called as polling()
		System.out.println(m.pollFirstEntry()); //akash=sharma
		System.out.println(m); // {gautam=rao, rupanshu=ram, sai=verma}
		System.out.println(m.pollFirstEntry()); //gautam=rao
		System.out.println(m); // {rupanshu=ram, sai=verma}
		System.out.println(m.pollLastEntry()); //sai=verma
		System.out.println(m); // {rupanshu=ram}
		System.out.println(m.pollLastEntry()); //rupanshu=ram
		System.out.println(m); // {}
		System.out.println(m.pollLastEntry()); //NULL
		
		System.out.println(m); // {}

		//ALL IN oNe e.g.
		initializeCollection(m);
		System.out.println(m.containsKey("rupanshu")); //true
		m.remove("rupanshu");
		System.out.println(m.containsValue("rao"));//true
		System.out.println(m); // [10, 20, 100]
//		m.remove(); // CTE as NOSuch method is there

		System.out.println(m.descendingKeySet()); //[sai, gautam, akash]
		System.out.println(m.descendingMap()); //{sai=verma, gautam=rao, akash=sharma}
		System.out.println(m.entrySet()); //[akash=sharma, gautam=rao, sai=verma]
		System.out.println(m.firstKey()); //akash
		System.out.println(m.firstEntry());//akash=sharma
		System.out.println(m.floorKey("gauta"));//akash
		System.out.println(m.floorEntry("gautam"));//gautam=rao
		//Returns a key-value mapping associated with the greatest key less than or equal to the given key, or null if there is no such key.
		
		System.out.println(m.get("akash")); //sharma

		System.out.println(m.headMap("gautam"));//{akash=sharma}
		System.out.println(m.headMap("gautam", true));//{akash=sharma, gautam=rao}
		
		System.out.println(m.higherEntry("gautam"));//sai=verma
			//Returns a key-value mapping associated with the least key strictly greater than the given key, or null if there is no such key.
		System.out.println(m.higherKey("gautam"));//sai
			//Returns the least key strictly greater than the given key, or null if there is no such key.

		System.out.println(m.lowerEntry("gautam"));//akash=sharma
			//Returns a key-value mapping associated with the greatest key strictly less than the given key, or null if there is no such key.
		System.out.println(m.lowerKey("gautam"));//akash
			//Returns the greatest key strictly less than the given key, or null if there is no such key.

		System.out.println(m.keySet());//[akash, gautam, sai]
		
		System.out.println(m.lastEntry());//sai=verma
		System.out.println(m.lastKey());//sai
		
		System.out.println(m.navigableKeySet());//[akash, gautam, sai]
			//Returns a NavigableSet view of the keys contained in this map.
		
		m.putAll(m);
		System.out.println(m);//{akash=sharma, gautam=rao, sai=verma}
			//Dup removed
		
		//System.out.println(m.subMap("gautam", "akash")); //EXCEPTION as fromKey>toKey
		System.out.println(m.subMap("akash", "gautam"));//{akash=sharma}
			//Returns a view of the portion of this map whose keys range from fromKey, inclusive, to toKey, exclusive.
		
		System.out.println(m.subMap("akash", true, "gautam", true));//{akash=sharma, gautam=rao}
			//Returns a view of the portion of this map whose keys range from fromKey to toKey.
		
		//System.out.println(m.subMap("gautam", "akash")); //EXCEPTION as fromKey>toKey
		System.out.println(m.tailMap("akash"));//{akash=sharma}
			//Returns a view of the portion of this map whose keys are greater than or equal to fromKey.
				
		System.out.println(m.tailMap("akash", true));//{akash=sharma, gautam=rao}
			//Returns a view of the portion of this map whose keys are greater than (or equal to, if inclusive is true) fromKey.
		
		System.out.println(m.values());//[sharma, rao, verma]
	}

	private static void initializeCollection(TreeMap m) {
		m.clear();
		m.put("gautam", "rao");//return Object
		m.put("rupanshu", "ram");
		m.put("akash", "sharma");
		m.put("sai", "verma");
	}
}
