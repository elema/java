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
		class Noise {
			void makeNoise(){
				System.out.println("Making noise");
			}
		}
		System.out.println("Starting Robot: " + id);
		Brain brain = new Brain();
		brain.think();
		Noise noise = new Noise();
		noise.makeNoise();
	}
}