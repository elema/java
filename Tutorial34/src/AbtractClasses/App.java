package AbtractClasses;

public class App {

	public static void main(String[] args){
		System.out.println("Chapter 37 = Abstract Classes");
		Camera nikon = new Camera();
		nikon.setId(1);
		nikon.run();
		
		Car honda = new Car();
		honda.setId(2);
		honda.run();
		
//		Machine machine1 = new Machine();
//		abstract classes are way stronger definition than interface
//		abstract classes is only one parent whereas interfaces can be many
	}
}