
public class Cow extends Animal{
	private String color;
	public void say() {
		System.out.println("cow says 'moo'");
	}
	public void doEat() {
		System.out.println("cow eats hay");
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
