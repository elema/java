
public class Machine implements Info,Operation{
	private int id = 3;
	String name;
	@Override
	public void start() {
		System.out.println("Machine started");
	}
	@Override
	public void stop() {
		System.out.println("Machine stopped");
	}
	String doPlus(String make, String model) {
		StringBuilder name = new StringBuilder();
		name.append(make).append(": ").append(model);
		return name.toString();
	}
	@Override
	public void showInfo() {
		System.out.printf("Machine id is: %d\n", id);
	}
}
