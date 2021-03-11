import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class StringSort {
public static void main(String[] args) {
	String input = "I am a java developer";
	String[] inputs = input.split(" ");
	
	ArrayList<String> arrayList = new ArrayList<String>();
	for(String s:inputs)
		arrayList.add(s);
	
	Collections.sort(arrayList, new Comparator<String>() {
		public int compare(String arg0, String arg1) {
			return arg1.compareToIgnoreCase(arg0);
		}
	});
	
	System.out.println(arrayList);
}
}
