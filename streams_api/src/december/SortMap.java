package december;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {
	
	public static void main(String args[]) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 30);
		map.put("B", 10);
		map.put("C", 20);
		
		LinkedHashMap<String, Integer> sorted = map.entrySet().stream()
		        .sorted(Map.Entry.comparingByValue())
		        .collect(Collectors.toMap(
		                Map.Entry::getKey,
		                Map.Entry::getValue,
		                (e1, e2) -> e1,
		                LinkedHashMap::new
		        ));

		System.out.println(sorted);
	}

}
