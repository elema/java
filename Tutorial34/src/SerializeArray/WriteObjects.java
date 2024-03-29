package SerializeArray;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects");
		Person[] people = { new Person(1, "mike"), new Person(2, "sue"),
				new Person(3, "bob") };
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
		try (FileOutputStream fs = new FileOutputStream("./src/array.txt")) {
			try (ObjectOutputStream os = new ObjectOutputStream(fs)) {
				os.writeObject(people);
				os.writeObject(peopleList);
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
