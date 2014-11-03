import java.util.Scanner;

public class Application {
	private static void Tutorial1() {
		System.out.println("tutorial 1 - first program");
		System.out.println("HelloWorld!");
	}
	private static void Tutorial2() {
		System.out.println("tutorial 2 - primitive types");
		// primitive types
	      int myNumber = 99;
	      short myShort = 987;
	      long myLong = 294874927;
	      double myDouble = 23.544;
	      float myFloat = 23.4f;
	      char myChar = 'y';
	      boolean myBoolean = true;
	      byte myByte = 127;	      
	      System.out.println(myNumber);
	      System.out.println(myShort);
	      System.out.println(myLong);
	      System.out.println(myDouble);
	      System.out.println(myFloat);
	      System.out.println(myChar);
	      System.out.println(myFloat);
	      System.out.println(myBoolean);
	      System.out.println(myByte);
	}
	
	private static void Tuturial3() {
		System.out.println("tutorial 3 - strings");
		String myString = "Hello";
		String myName = "Asim";
		myName = "Asim Kaghzi instead of Asim only";
		int myAge = 47;
		String myGreeting = myString + " " + myName;
		System.out.println(myGreeting);
		System.out.println(myName + " is " + myAge);
	}

	private static void Tutorial4() {
		System.out.println("tutorial 4 - while loop");
		int myInt = 1;
		while (myInt < 3)
		{
		System.out.println(myInt);
		myInt++;
		}
		boolean myBoolean = true;		
		System.out.println(myBoolean);
	}

	private static void Tutorial5() {
		System.out.println("tutorial 5 - for loop");
		System.out.println("I am starting for loop.");
		for (int myInt=1;myInt < 3;myInt++)
		{
			System.out.printf("myInt is: %d \n",myInt);
		}
		System.out.println("I am done with for loop.");
	}

	private static void Tutorial6() {
		System.out.println("tutorial 6 - if/else");
		int myInt = 6;
		if(myInt < 5 ) {
			System.out.printf("myInt is too small, it is %d.\n", myInt);
		}
		else if(myInt == 5)
		{
			System.out.printf("myInt is just right, it is %d\n", myInt);
		}
		else {
			System.out.println("myInt is too large.");
		}
	}

	private static void Tutorial7() {
		System.out.println("tutorial 7 - while loop");
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer: ");
		int value = input.nextInt();
		while(value < 11)
		{
			System.out.printf("Current number is %d\n", value);
			value++;
		}
//		System.out.println("You entered " + value);
	}
	
	private static void Tutorial8() {
		System.out.println("tutorial 8 - do/while");
		Scanner i = new Scanner(System.in);
		int value = 0;
		do {
			System.out.println("input a number: ");
			value = i.nextInt();
		} 
		while(value != 5);
			System.out.println("You got it right!");
	}

	private static void Tutorial9() {
		System.out.println("tutorial 9 - switch");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter command: ");
		String text = input.next();
		switch(text) {
			case "start":
				System.out.println("starting");
				break;
			case "stop":
				System.out.println("stopping");
				break;
			default:
				System.out.println("unknow command");
				break;		
		}
	}

	private static void Tutorial10_12() {
		System.out.println("tutorial 10 to 12 - Arrays");
		String[] words = new String[3];
		words[0] = "Hi";
		words[1] = "There";
		words[2] = "Asim";
		System.out.println(words[0] + " " + words[1] + " " + words[2]);		
		String[] fruits = {"apple", "pear", "banana", "orange"};
		for(String fruit:fruits) {
			System.out.println("current fruit is " + fruit);
		}
		int[] myInts = {1,2,3,4};
		for(int myint:myInts)
		{
			System.out.println("myInt is " + myint);
		}
		int[][] mdInt = {
				{3,4,5},
				{9,8,7}
		};
		System.out.println(mdInt[0][0] + " " + mdInt[1][0]);
		String[][] texts = new String[2][3];
		texts[0][0] = "Hi there!";
		System.out.println(texts[0][0]);
		for(int row=0; row < mdInt.length;row++) {
			for(int col=0; col < mdInt[row].length;col++) {
				System.out.print(mdInt[row][col] + "\t");
			}
			System.out.println();
		}
		String[][] newtexts = new String[2][];
		newtexts[0] = new String[3];
		newtexts[0][1] = "Hi there from md array ";
		System.out.println(newtexts[0][1]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tuturial3();
	}

}
