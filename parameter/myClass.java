import java.util.*;
public class myClass {
	public static void main(String[] args){
		otherClass otherObject = new otherClass();
		Scanner yourInput = new Scanner(System.in);
		System.out.println("Whats your name: ");
		String gottenInput = yourInput.nextLine();
		otherObject.otherMethod(gottenInput);
	}
}