import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class App {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Chapter 33 - Reading Text Files");
		String file = "./src/example.txt";
		File textFile = new File(file);
			Scanner in = new Scanner(textFile);
			while(in.hasNextLine()) {
				String line = in.nextLine();
				System.out.println(line);
			}
			in.close();
	}
}