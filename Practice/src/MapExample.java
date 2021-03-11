import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

		hashmap.put("Arbind", 100);
		hashmap.put("Raman", 12);
		hashmap.put("Rohit", 111);
		hashmap.put("Nishant", 120);

		System.out.println("Keys in the map: " + hashmap.keySet());
		System.out.println("Values of the keys: " + hashmap.values());
		System.out.println("Map contains entries composed of key/value pairs: "+ hashmap.entrySet());
		System.out.println("Checking if key exist: "+hashmap.containsKey("Rupanshu"));
		System.out.println("Checking if key exist: " +hashmap.containsKey("Raman"));
		System.out.println("Checking if value exist: "+hashmap.containsValue(100));
		System.out.println("Checking if key exist: "+hashmap.get("Arbind"));
		
		// Iterating over a map which is consisting of table of rows(formallly called entry) and containg two 
		// columns key, value
		System.out.println("Iterating over a map: ");
		for (Entry<String, Integer> entry: hashmap.entrySet()) {
			System.out.println("Key: "+entry.getKey() + " Value: "+entry.getValue());
		}
	}
}