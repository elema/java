package SortedMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		System.out.println("Sorted Map");
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		System.out.println("Hash Map");
		testMap(hashMap);
		System.out.println("Linked Hash Map");
		testMap(linkedHashMap);
		System.out.println("Tree Map");
		testMap(treeMap);
				
	}
	public static void testMap(Map<Integer, String> map){
		map.put(5, "asim");
		map.put(6, "zari");
		map.put(2, "sami");
		map.put(3, "mani");
		map.put(1, "khadija");
		map.put(4, "hasni");
		
		for(Integer key: map.keySet()){
			String value = map.get(key);
			System.out.println(key + ": " + value);
		}
	}

}
