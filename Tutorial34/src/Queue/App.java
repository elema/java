package Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		System.out.println("Queue");
		Queue<Integer> abq = new ArrayBlockingQueue<Integer>(5);
		try {
			abq.add(1);
			abq.add(4);
			abq.add(7);
			abq.add(3);
			abq.add(2);
		} catch (IllegalStateException e) {
			System.out.println("No more space available in queue: ");
		}
		System.out.println("\nIterate through queue");
		for(Integer i: abq){
			System.out.println(i);
		}
		System.out.println("\nRemoving items from queue");
		for(int i = 0; i < 2; i++){
			System.out.println("removing: " + abq.remove());
		}
		System.out.println("\nIterate after removal");
		for(Integer i: abq){
			System.out.println(i);
		}
		Queue<Integer> abq2 = new ArrayBlockingQueue<Integer>(4);
		try {
			abq2.offer(1);
			abq2.offer(4);
			abq2.offer(7);
			abq2.offer(3);
			if(abq2.offer(2) == false){
				System.out.println("\nOffer failed");
			}
		} catch (IllegalStateException e) {
			System.out.println("No more space available in queue");
		}
		System.out.println("\nRemoving items from queue via poll()");
		for(int i = 0; i < 2; i++){
			System.out.println("removing via poll: " + abq2.poll());
		}
		System.out.println("\nIterate after removal via poll()");
		for(Integer i: abq){
			System.out.println(i);
		}

	}

}