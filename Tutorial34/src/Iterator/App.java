package Iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		System.out.println("Iterator");
		List<String> animals = new LinkedList<String>();
		animals.add("cat");
		animals.add("tiger");
		animals.add("lion");
		animals.add("dog");
		animals.add("fido");

		Iterator<String> it = animals.iterator();
		System.out.println("\nIteration using while loop and iterator");
		while (it.hasNext()) {
			String item = it.next();
			System.out.println(item);
				if(item.equals("fido")){
				it.remove();
			}
		}
		System.out.println("\niteration using for loop");
		for (String animal : animals) {
			System.out.println(animal);
		}
	}

}
