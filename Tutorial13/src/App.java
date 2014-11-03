class Person{
	String name,fullName,fName,lName;
	int age,height;
	void speak(){
		System.out.println("+++ Automatic: " + name + " is " + age + ".");
	}
	void sayGreeting() {
		System.out.println("Hi " + name);
	}
	int yearsToRetire() {
		int yearsLeft = 60 - age;
		return yearsLeft;
	}
	String getFullName() {
		String fullName = fName + " " + lName;
		return fullName;
	}
	
}

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	public void jump(int height) {
		System.out.println("Jumped: "  + height);
	}
	public void travel(String direction, double distance) {
		System.out.println("moving " + distance + " meters in direction " + direction);
	}
}
class Frog {
	private String name;
	private int age;
	public void setName(String newName) {
		name = newName;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
class Machine{
	private String name;
	private int code;
	public Machine() {
		this("Arnie",0);
		System.out.println("constructor running");
	}
	public Machine(String name) {
		System.out.println("constructor running 2");
		this.name = name;
	}
	public Machine(String name, int code) {
		System.out.println("constructor running 3");
		this.name = name;
		this.code = code;
	}
}
	class Thing{
		public final static int LUCKYNUMBER = 8;
		public String name;
		public static String description;
		public static int count = 0;
		public Thing() {
			count++;
		}
		public final static void getInfo() {
			System.out.println("I am static method");
		}
	}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tutorial 13/14 - classes and methods \n-----------------------");
		Person person = new Person();
		person.age = 46;
		person.name = "Asim Kaghzi";
		System.out.println("*** Manual: " + person.name + " is " + person.age);
		person.speak();
		Person	second = new Person();
		second.name = "Joe Shmoe";
		second.age = 30;
		System.out.println("*** Manual: " + second.name + " is second person.");
		second.speak();
		second.sayGreeting();
		System.out.println("Tutorial 15 - Getter methods\n----------------------------");
		int years = second.yearsToRetire();
		System.out.println(second.name + " have " + years + " years to retire.");
		Person third = new Person();
		third.fName="Zarina";
		third.lName="Kaghzi";
		String name = third.getFullName();
		System.out.println("third persons full name is " + name);
		System.out.println("Tutorial 16 - parameters");
		Robot sam = new Robot();
		sam.speak("Hi I am sam! and not jane");
		sam.jump(3);
		sam.travel("north", 4);
		System.out.println("Tutorial 17 - setters");
		Frog frog1 = new Frog();
//		frog1.name="fred";
//		frog1.age=1;
		System.out.println(frog1.getName());
		frog1.setName("froggie");
		frog1.setAge(3);
		System.out.println(frog1.getName() + " is " + frog1.getAge());
		System.out.println("Tutorial 1 - constructor\n------------------------");
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Froggie");
		Machine machine3 = new Machine("Boogie",4);
		System.out.println("chapter 19 - static final");
		Thing.description = "I am description";
		System.out.println("before init count " + Thing.count);
		Thing thing1 = new Thing();
		System.out.println("after init count " + Thing.count);
		Thing thing2 = new Thing();
		System.out.println("after init count " + Thing.count);
		Thing.description = "I am post initiation description";
		thing1.name = "Bob";
		thing2.name = "Sue";
		Thing.description = "something very odd";
		System.out.println("thing1 : " + thing1.name);
		System.out.println("thing2 : " + thing2.name);
		System.out.println("Description: " + Thing.description);
		System.out.println("thing1 : " + Thing.description);
		System.out.println("thing2 : " + Thing.description);
		Thing.getInfo();
		Thing.getInfo();
		System.out.println(Math.PI);
//		thing1.LUCKYNUMBER=7;
		System.out.println(Thing.LUCKYNUMBER);
	}

}
