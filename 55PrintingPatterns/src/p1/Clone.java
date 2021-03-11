package p1;

import java.util.ArrayList;

public class Clone {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(Integer.valueOf(5));
		arrayList.add(Integer.valueOf(2));
		arrayList.add(Integer.valueOf(7));
		arrayList.add(Integer.valueOf(4));
		
		ArrayList arrayList2 = (ArrayList) arrayList.clone();
		System.out.println(arrayList);
		System.out.println(arrayList2);
	}
}
