package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(3, "Shubham");
		hashMap.put(1, "Akshit");
		hashMap.put(2, "Neha");
		
		System.err.println(hashMap);
		
		String student = hashMap.get(3);
		System.err.println(student);
		
		System.err.println(hashMap.containsKey(3));  // 0(1)
		System.err.println(hashMap.containsValue("Shubham"));
		
		Set<Integer> keys = hashMap.keySet();
		
		for(int i : keys) {
			System.err.println(hashMap.get(i));
		}
		
		Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
		
		for(Map.Entry<Integer, String> entry : entries) {
			System.err.println(entry.getKey() + " : " + entry.getValue());
			entry.setValue(entry.getValue().toUpperCase());
		}
		
		System.err.println(hashMap);
		
		System.err.println("Removed ? : " + hashMap.remove(31, "Nitin"));
		
		List<Integer> list = Arrays.asList(3, 5, 6, 2, 0);
		list.contains(6);  // 0(n)


		
		
	}

}
