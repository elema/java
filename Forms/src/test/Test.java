package test;

import beans.User;

public class Test {
	public static void main(String[] args){
		System.out.println("Hello from test.Test class");
		User user = new User("akaghzi@gmail.com","drirum7");
		if (user.validate()){
			System.out.println("Bean validates OK");
		}
		else {
			System.out.println("Bean does not validate");
			System.out.println(user.getMessage());
		}
	}
}