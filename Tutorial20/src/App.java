import java.util.ArrayList;
import java.util.HashMap;
import ocean.*;
import appaux.*;
import com.cet.myh.*;

public class App {

	private static void stringBuild() {
		System.out
				.println("Chapter 20 - String building and formatting\n----------------");
		String info = "";
		info += "My name is Asim";
		System.out.println(info);
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Kaghzi");
		sb.append(" and ");
		sb.append("I am learning java.");
		System.out.println(sb.capacity());
		StringBuilder s = new StringBuilder();
		s.append("My name is Zarina").append(",and ")
				.append("I am preparing for eid party");
		System.out.println(s);
		for (int i = 1; i < 3; i++) {
			System.out.printf("%s %d\n", "Current val: ", i);
		}
		System.out.printf("%.2f\n", 123.47);
		System.out.printf("%6.1f\n", 123.47);
	}

	private static void stringTo() {
		Frog frog1 = new Frog(2, "Fred");
		Frog frog2 = new Frog(3, "Baggy");
		System.out.println(frog1);
		System.out.println(frog2);
	}

	private static void inheritance() {
		System.out.println("Chapter 21 - inheritance");
		Machine mac1 = new Machine();
		mac1.start();
		Car car1 = new Car();
		car1.start();
		car1.wipeWindShield();
		car1.stop();
		car1.name = "Mercedes Benz";
		System.out.printf("I am %s\n", car1.name);
		System.out.println(car1.doPlus("Mercedes", "E-350"));
	}

	private static void tutorial22() {
		System.out.println("Chapter 22 - packages\n-------------------");
		Fish fish1 = new Fish();
		Seaweed weed = new Seaweed();
		Patient patient1 = new Patient();
		patient1.setName("Asim Kaghzi");
		System.out.println(patient1.getName());
	}

	private static void tutorial23() {
		System.out.println("Chapter 23 - interfaces\n-------------------");
		Machine mach1 = new Machine();
		// mach1.start();
		Person person1 = new Person("Asim Kaghzi");
		// person1.greet();
		mach1.showInfo();
		person1.showInfo();
		Info info1 = new Machine();
		System.out.println(info1.getClass());
		System.out.println();
		info1.showInfo();
	}

	private static void tutorial25() {
		System.out.println("chapter 25 - private, public, protected");
		Plant plant1 = new Oak();
		plant1.name = "oak";
		// below would not work because size and height is not in same package.
		// System.out.printf("%s = %s\n",plant1.size,plant1.height);
		System.out.printf("%d = %s.\n", plant1.ID, plant1.name);
	}

	private static void tutorial26() {
		System.out.println("chapter 26 - polimorphism");
		Specie specie = new Specie();
		Cat cat = new Cat();
		Specie laura = cat;
		laura.grow();
		// following does not work
		// laura.says();
		// following would work
		cat.says();
	}

	private static void tutorial27() {
		System.out.println("chapter 26 - encapsulation and api docs");
		Subject subject = new Subject();
		subject.setName("Physics");
		System.out.println(subject.getName() + " has " + subject.getData());
		System.out.println(subject.getName().matches("Physics"));
	}

	private static void tutorial28() {
		System.out.println("chapter 28/29 - casting");
		int i = 100;
		short s=2;
		byte b = 10;
		long l = 1048576;
		float f = 1.2f;
		double d = 1.3454010485967;
//		System.out.println(int.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println((int)f);
	}
	
	private static void tutorial29() {
		System.out.println("chapter 29 - upcasting");
		Animal a1 = new Animal();
		Cow c1 = new Cow();
		System.out.println("--- this is a1");
		a1.say();
		System.out.println("--- this is c1");
		c1.say();
		c1.doEat();
		c1.setColor("grey");
		Animal a2 = c1;
		System.out.println("--- this is a2");
		a2.say();
		System.out.println("--- this is a3");
		Animal a3 = new Cow();
		a3.say();
		System.out.println("--- this is c2");
		//upcasting
		Cow c2 = (Cow)c1;
		c2.say();
		c2.doEat();
		System.out.println("c2 color: " + c2.getColor());
	}
	
	private static void generics() {
		System.out.println("Chapter - Generics");
		ArrayList<String> list = new ArrayList<String>();
		list.add("Asim");
		list.add("Mr");
		list.add("Riaz");
		list.add("Kaghzi");
		System.out.printf("Name: %s, %s %s. %s\n",list.get(3),list.get(0),list.get(2),list.get(1));
		String salutation = list.get(1);
		System.out.println("Salutation: " + salutation);
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(1, "Asim");
		hMap.put(2, "Farhan");
		System.out.println(hMap.get(2));
	}
    
	private static void wildcards() {
    	System.out.println("Chapter - Generics and Wildcards");
    	ArrayList<Camera> arrayList = new ArrayList();
    	arrayList.add(new Camera());
    	arrayList.add(new Camera());
    	showList(arrayList);
    }
	
	public static void showList(ArrayList<?> list) {
		for(Object value: list) {
//			value.start();
//			value.snap();
		}
	}
	
	private static void chapter32() {
		System.out.println("Chapter 32 - Anonymous Classes");
		Camera nikon = new Camera() {

		@Override
		public void snap() {
			System.out.println("Good photo taken");
		}
	};
		// inherited from machine class which is parent of camera
		nikon.start();	
		// overridden method at the time of instantiation
		nikon.snap();
		// overridden by camera class
		nikon.stop();			
	}
	public static void main(String[] args) {
		chapter32();
		Plant plant1 = new Plant() {
			@Override
			public void grow() {
				System.out.println("Plant growing");				
			}
		};
		plant1.grow();
	}
}