package SerializeArray;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {
	public static void main(String[] args) {
		System.out.println("Reading Objects");
		try (FileInputStream fi = new FileInputStream("./src/array.txt")) {
			try (ObjectInputStream oi = new ObjectInputStream(fi)) {
				Person[] people = (Person[]) oi.readObject();

				@SuppressWarnings("unchecked")
				ArrayList<Person> peopleList = (ArrayList<Person>) oi
						.readObject();
				for (Person person : people) {
					System.out.println(person);
				}
				System.out.println("from ArrayList Object");
				for (Person person : peopleList) {
					System.out.println(person);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (EOFException e) {
				// System.out.println("End of File");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
