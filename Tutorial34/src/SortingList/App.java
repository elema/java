package SortingList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		System.out.println("Sorting List");

		List<Integer> identifiers = new ArrayList<Integer>();
		identifiers.add(3);
		identifiers.add(2);
		identifiers.add(8);
		identifiers.add(1);
		System.out
				.printf("default order of integers\n-------------------------\n");
		Collections.sort(identifiers);
		for (Integer i : identifiers) {
			System.out.println(i);
		}

		List<String> animals = new ArrayList<String>();
		animals.add("jackal");
		animals.add("cat");
		animals.add("chicken");
		animals.add("dog");
		animals.add("tiger");
		animals.add("lion");

		Collections.sort(animals);
		System.out.println("-------------\ndefault order\n-------------\n");
		for (String animal : animals) {
			System.out.println(animal);
		}

		Collections.sort(animals, new StringLengthComparator());
		System.out.printf("------------\ncustom order\n------------\n");
		for (String animal : animals) {
			System.out.println(animal);
		}

		Collections.sort(animals, new ReverseStringComparator());
		System.out.printf("------------\ncustom reverse order\n------------\n");
		for (String animal : animals) {
			System.out.println(animal);
		}

		Collections.sort(identifiers, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1.compareTo(o2)) * -1;
			}
		});
		System.out.printf("--------------------------------\nCustom reverse order of integers\n--------------------------------\n");
		for (Integer i : identifiers) {
			System.out.println(i);
		}
		
		Person p1 = new Person(1, "asim");
		Person p2 = new Person(3, "khadija");
		Person p3 = new Person(2, "mani");
		Person p4 = new Person(4, "saami");
		Person p5 = new Person(5, "zari");
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(p3);
		personList.add(p5);
		personList.add(p2);
		personList.add(p4);
		personList.add(p1);
		Collections.sort(personList, new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.printf("-------------------\nSorted Objects by name\n-------------------\n");
		for(Person p: personList){
			System.out.println(p);
		}
		Collections.sort(personList, new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getId() > o2.getId()){
					return 1;
				}
				else if(o1.getId() <  o2.getId()){
					return -1;
				}
				return 0;
			}
		});

		System.out.printf("-------------------\nSorted Objects by id\n-------------------\n");
		for(Person p: personList){
			System.out.println(p);
		}
	}
	
	public static void testMap(Map<Integer, String> map) {
	}

}