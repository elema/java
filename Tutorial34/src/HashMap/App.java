package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class App {

	public static void main(String[] args) {
		System.out.println("Hash Map");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(8, "asim");
		map.put(2, "zari");
		map.put(3, "saami");
		map.put(4, "mani");
		map.put(5, "ashoo");
		map.put(1, "khadija");
		
		System.out.println(map.get(4));
		System.out.println(map.size());
		System.out.println("Iteration from map");
		for(Entry<Integer, String> hm: map.entrySet()){
			System.out.println(hm.getKey() + ": " + hm.getValue());
		}
		
	}

}
