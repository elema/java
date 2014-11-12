package Iterable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UrlLibrary implements Iterable<String>{
	private List<String> l = new LinkedList<String>();
	private class UrlIterator implements Iterator<String>{
		private int index = 0;
		@Override
		public boolean hasNext() {
			return index < l.size();
		}

		@Override
		public String next() {
			StringBuilder sb = new StringBuilder();
			try {
				URL url = new URL(l.get(index));
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				String line = null;
				while((line = br.readLine()) != null){
					sb.append(line);
					sb.append("\n");
				}
				br.close();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			index++;
			return sb.toString();
		}
		
		@Override
		public void remove(){
			l.remove(index);
		}
		
	}
	public UrlLibrary(){
	l.add("http://honey-do-this.net");
	l.add("http://mysindh.org");
	}
	@Override
	public Iterator<String> iterator() {
		return new UrlIterator();
	}
	
//	@Override
//	public Iterator<String> iterator() {
//		return l.iterator();		
//	}
}