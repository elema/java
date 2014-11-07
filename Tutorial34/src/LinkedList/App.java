package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		System.out.println("Linked List");
		// @SuppressWarnings("unchecked")
		List<Integer> arrayList = new ArrayList();
		List<Integer> linkedList = new LinkedList();
		doTiming("ArrayList", arrayList);
		doTiming("LinkedList", linkedList);
		getTiming("ArrayList", arrayList);
		getTiming("LinkedList", linkedList);
	}

	private static void doTiming(String type, List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1E6; i++) {
			list.add(i);
		}
		System.out.println("Time: " + (System.currentTimeMillis() - start) + " ms for " + type);
	}
	private static void getTiming(String type, List<Integer> list){
		Random random = new Random();
		Long start = System.currentTimeMillis();
		for(int i = 1; i<100 ; i++){
		list.get(1 + random.nextInt(999999));
		}
		System.out.println((System.currentTimeMillis() - start) + "ms elapsed for " + type);
	}

}