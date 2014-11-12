package NaturalOrder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		System.out.println("Natural Order");
		List<String> list = new ArrayList<String>();
		addElements(list);
		Collections.sort(list);

		System.out.println("\nsorting arraylist of strings");
		showElements(list);
		// Tree Set is auto sorted
		Set<String> set = new TreeSet<String>();
		addElements(set);
		System.out.println("\nsorting Treeset of strings");
		showElements(set);

		System.out.println("\nsorting arraylist of objects");
		List<Person> people = new ArrayList<Person>();
		addObjects(people);
		// ArrayList is unsorted so have to be sorted
//		Collections.sort(people);
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
//				return o1.getName().compareTo(o2.getName());
				
				  if (o1.getId() > o2.getId()) { return 1; } else if
				  (o1.getId() < o2.getId()) { return -1; } return 0;
				 
			}
		});

		showObjects(people);
		
		System.out.println("\nsorting hash set of objects");
		SortedSet<Person> team = new TreeSet<Person>();
		addObjects(team);
		// Tree Set sorted by custom method of class Person
		showObjects(team);

	}

	private static void addElements(Collection<String> c) {
		c.add("asim");
		c.add("zari");
		c.add("khadija");
		c.add("saami");
		c.add("mani");
	}

	private static void showElements(Collection<String> c) {
		for (String s : c) {
			System.out.println(s);
		}
	}

	private static void addObjects(Collection<Person> c) {
		c.add(new Person(1, "asim"));
		c.add(new Person(10, "zari"));
		c.add(new Person(34, "saami"));
		c.add(new Person(2, "mani"));
	}

	private static void showObjects(Collection<Person> c) {
		for (Person s : c) {
			System.out.println(s);
		}
	}

}
