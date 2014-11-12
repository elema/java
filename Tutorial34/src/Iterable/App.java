package Iterable;

import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		System.out.println("Iterable");
		UrlLibrary urlLibrary = new UrlLibrary();
		
		for(String url: urlLibrary){
			System.out.println(url.length());
			}
		}

}