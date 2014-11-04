package Recursion;

public class App {

	public static void main(String[] args) {
		System.out.println("Chapter - Recursion");
		int i = 10;
//		System.out.println("from calc method");
//		calc(i);
//		System.out.println("from main method");
//		System.out.println(i);
//		System.out.println("from main method calling factorial");
		System.out.println(factorial(i));
	}
	private static int calc(int i) {
//		System.out.println(i);
		if(i == 1) {
			return 1;
		}
		return calc(i - 1);

	}
	private static int factorial(int i) {
//		System.out.println(i);
		if(i == 1) {
			return 1;
		}
//		System.out.println("*");
//		System.out.println(i);
		return factorial(i - 1 ) * i;
	}
}
