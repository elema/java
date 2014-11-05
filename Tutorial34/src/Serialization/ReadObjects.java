package Serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("Reading Objects");
		try(FileInputStream fi = new FileInputStream("./src/object.txt")){
			try(ObjectInputStream oi = new ObjectInputStream(fi)){
//				Person mike = (Person)oi.readObject();
//				System.out.println(mike);
//				Person sue  = (Person)oi.readObject();
//				System.out.println(sue);
				Person p;
				while((p = (Person)oi.readObject()) != null) {
					System.out.println(p);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(EOFException e) {
//				System.out.println("End of File");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
