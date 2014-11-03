class secondProg{
	public static void main(String[] args ) {
		int fnum = 10;
		int snum = 11;
		if (fnum >= 15 && snum <= 20) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		if (fnum >= 15 || snum <= 20){
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
		int age = 3;
		switch (age){
			case 1:
			System.out.println("crawl");
			break;
			case 2:
			System.out.println("walk or talk");
			break;
			case 3:
			System.out.println("walk and talk");
			break;
			default:
			System.out.println("do whatever");
			break;
		}
		int counter = 1;
		while (counter < 11) {
			System.out.println(counter);
			counter++;
		}
	}
	public void simpleMessage(){
		System.out.println("This is simple message class available to public, from secondProg.");
	}
	// method with parameters
	
}