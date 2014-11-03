import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class App {

	public static void main(String[] args)  {
		System.out.println("Chapter 34 = Exceptions");
		File file = new File("./src/example.txt");
		try {
		FileReader fileReader = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file);
		}
		
	}

}
