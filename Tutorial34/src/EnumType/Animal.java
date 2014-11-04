package EnumType;

public enum Animal {
	CAT("Feline"), DOG("Fido"), MOUSE("Tom");
	private String name;
	Animal(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
