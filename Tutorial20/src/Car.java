
public class Car extends Machine{
	public void wipeWindShield() {
		System.out.println("Windshield wipped");
	}
	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
	public void showName() {
		System.out.println(name);
	}
	
}
