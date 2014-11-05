package CopyTextFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		File source = new File("./src/example.txt");
		File target = new File("./src/target.txt");
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(target))){
			try(BufferedReader br = new BufferedReader(new FileReader(source))){
				String line;
				while((line = br.readLine()) != null) {
					System.out.println(line);
					bw.write(line);
					bw.newLine();
				}
			}
			catch(FileNotFoundException e) {
				System.out.println("Source file not found: " + source);
			}
			catch(IOException e) {
				System.out.println("Source file not readable: " + source);
				
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Target file not found: " + target);
		}
		catch(IOException e) {
			System.out.println("Target file not writable: " +  target);
		}

	}

}
