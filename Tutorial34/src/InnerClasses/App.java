package InnerClasses;

public class App {

	public static void main(String[] args) {
		System.out.println("Chapter 43 - Inner Classes");
		Robot r1 = new Robot(10);
		r1.start();
		Robot.Battery battery1 =  new Robot.Battery();
		System.out.println("from robot ++");
		battery1.charge();
		
		System.out.println("from machine **");
		Machine m1 = new Machine();
		Machine.Battery battery2 = m1.new Battery();
		battery2.charge();
	}

}
