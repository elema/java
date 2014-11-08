package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		System.out.println("Sets");
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new TreeSet<String>();
		set1.add("bat");
		set1.add("wicket");
		set1.add("helmet");
		set1.add("leg pad");
		set1.add("ball");
		set1.add("hat");
		set1.add("hat");
		System.out.println("set1");
		System.out.println(set1);
		System.out.println("Iterator +++");
		for(String citem: set1){
			System.out.println(citem);
		}
		set2.add("bat");
		set2.add("post");
		set2.add("helmet with facemask");
		set2.add("leg pad");
		set2.add("ball");
		set2.add("shoulderpad");
		System.out.println("set2");
		System.out.println(set2);
		System.out.println("Iterator ***");
		for(String hitem: set2){
			System.out.println(hitem);
		
		}
		Set<String> set3 = new HashSet<String>(set1);
		System.out.println("Intersection");
		set3.retainAll((set2));
		System.out.println(set3);
		System.out.println("Minus");
		Set<String> set4 = new HashSet<String>(set1);
		set4.removeAll(set2);
		System.out.println(set4);
	}

}
