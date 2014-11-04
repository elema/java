package EnumType;

public class App {

	public static void main(String[] args) {
		switch (Animal.CAT) {
		case CAT:
			System.out.println("Cat");
			System.out.println(Animal.CAT.getName());
			System.out.println(Animal.CAT.name());
			System.out.println(Animal.valueOf("CAT"));
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;

		}
		/*
		System.out.println(Animal.DOG.getClass());
		System.out.println(Animal.MOUSE instanceof Enum);
		*/
	}

}
