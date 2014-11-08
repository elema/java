package Set;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class AsKeyMap {

	public static void main(String[] args) {
		System.out.println("Sets");
//		Map<String,Integer> map = new HashMap<String,Integer>();
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
//		map.put("one",1);
//		map.put("ten",10);
//		map.put("two",2);
//		map.put("four",4);
//		map.put("ten", 12);
		
//		for(String s: map.keySet()){
//		System.out.println(s + ": " + map.get(s));
//		}
		Person ak = new Person(1,"asim kaghzi");
		Person zk = new Person(3,"zarina kaghzi");
		Person mk = new Person(2,"manik kaghzi");
		Person rk = new Person(3,"zarina kaghzi");

		Set<Person> set = new LinkedHashSet<Person>();
		set.add(ak);
		set.add(zk);
		set.add(mk);
		set.add(rk);
		System.out.println(set);
		
		Map<Person,Integer> person = new LinkedHashMap<Person,Integer>();
		person.put(ak, 1);
		person.put(zk,2);
		person.put(mk,3);
		person.put(rk,4);
		System.out.println(person);
		}
}