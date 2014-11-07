package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		System.out.println("ArrayList");
//		@SuppressWarnings("unchecked")
		ArrayList<Integer> arrayList = new ArrayList();
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(2);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Slot: "+ i + " = " + arrayList.get(i));
		}
		System.out.println("Direct iteration");
		for(Integer i: arrayList){
			System.out.println("Item= " + i);
		}
		System.out.println("List");
		List<Integer> l= new ArrayList<Integer>();
		l.add(100);
		for(Integer i: l){
			System.out.println("List item= " + i);
		}
	}

}