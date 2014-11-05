package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects");
		Person mike = new Person(543, "Mike");
		Person sue = new Person(123, "Sue");
//		System.out.println(mike);
//		System.out.println(sue);
		try (FileOutputStream fs = new FileOutputStream("./src/object.txt")) {
			try (ObjectOutputStream os = new ObjectOutputStream(fs)) {
				os.writeObject(mike);
				os.writeObject(sue);
			} catch (FileNotFoundException e) {
				System.out.println("File not found exception for: ");
			} catch (IOException e) {
				System.out.println("IO exception for:");
			}

		} catch (FileNotFoundException e) {
			System.out.println("FNFE");
		} catch (IOException e) {
			System.out.println("IOE");
		}

	}

}
