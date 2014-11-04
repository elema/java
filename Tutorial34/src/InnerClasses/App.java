package InnerClasses;

public class App {

	public static void main(String[] args) {
		System.out.println("Chapter 43 - Inner Classes");
		Robot r1 = new Robot(10);
		r1.start();
		Robot.Battery battery = new Robot.Battery();
		System.out.println("app call");
		battery.charge();
		
	}

}
