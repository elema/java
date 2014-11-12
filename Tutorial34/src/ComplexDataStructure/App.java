package ComplexDataStructure;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class App {
	public static String[] city = { "sukkur", "stamford", "calgary" };
	public static String[][] family = {
			{ "rashid", "imrana", "asha", "hasni", "rabail" },
			{ "farhan", "shahida", "mani", "saami" }, 
			{ "asim", "zari" } 
			};

	public static void main(String[] args) {
		System.out.println("Complex Data Structure");
		Map<String, String[]> map = new HashMap<>();
		for(int i=0; i< city.length; i++){
			map.put(city[i],family[i]);
		}

		System.out.println("\nCities with Family members");
		for(String c: city){
			System.out.print("\n" + c + ": ");
			for(String fmember: map.get(c)){
				System.out.print(fmember + ", ");
			}
		}
	}
}