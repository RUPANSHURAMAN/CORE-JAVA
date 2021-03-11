package p1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("Rupanshu", "Raman");

		for (Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(entry);
		}
		
		int[] arr = new int[]{4, 4, 2, 1};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
