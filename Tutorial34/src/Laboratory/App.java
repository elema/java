package Laboratory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class App {
	 
	public static void main(String[] args) {
		// Random numbers
		Random random = new Random();
		System.out.println(random.nextInt(1000000));
		// system properties array
		System.out.println(System.getProperties());
		try{
			URL url = new URL("http://www.cbc.ca/directory/myfile.html");
		} catch(MalformedURLException e){
			e.printStackTrace();
		}
		System.out.println("encoding\n********");
		System.out.println(javax.print.DocFlavor.URL.hostEncoding);	
		List<String> l = new LinkedList<String>();
		l.add("http://kaghzi.com");
		l.add("http://www,cbc.ca");
		try {
			URL url = new URL(l.get(0));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}