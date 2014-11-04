package InnerClasses;

public class Robot {
	private int id;
	private class Brain {
		public void think() {
			System.out.println("Robot " + id + " thinking");
		}
	}
	static class Battery {
		public void charge() {
			System.out.println("Battery charging");
		}
	}
	public Robot(int id) {

		this.id = id;
	}
	public void start() {
		System.out.println("Starting Robot: " + id);
		Brain brain = new Brain();
		brain.think();
//		Battery battery = new Battery();
//		battery.charge();
	}
}
