
public class Subject {
	private String name;
	public final static int ID = 1;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getData() {
		String data = "growth of " + calcGrowth() + " percent.";
		return data;
	}
	private int calcGrowth() {
		return 9;
	}
}
