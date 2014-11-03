package appaux;

public class Plant {
	public final static int ID = 1;
	private String type; // private to plant
	protected String size; //private to package appaux and class Plant
	public String name; // public
	int height; // private to package appaux
	public Plant() {
		this.name = "Broccoli";
		this.type = "plant";
		this.size = "unknown";
	}
}