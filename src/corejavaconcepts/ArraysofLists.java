package corejavaconcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysofLists {

	public static void main(String[] args) {
		List<Map<String, Object>> listOfMaps = new ArrayList<>();
		Map<String, Object> map1 = new HashMap<>();
		map1.put("name", "John");
		map1.put("age", 30);
		listOfMaps.add(map1);

		Map<String, Object> map2 = new HashMap<>();
		map2.put("name", "Alice");
		map2.put("age", 25);
		listOfMaps.add(map2);
		System.out.println(listOfMaps);
		
		for (Map<String, Object> map : listOfMaps) {
		    for (Map.Entry<String, Object> entry : map.entrySet()) {
		        String key = entry.getKey(); 
		        Object value = entry.getValue();
		        System.out.format("%s: %s\n", key, value);
		    }
		}

	}


}