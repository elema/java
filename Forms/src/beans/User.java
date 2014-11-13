package beans;

public class User {
	private String email = "";
	private String password = "";
	private String message = "";

	public String getMessage() {
		return message;
	}

	public User() {

	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Boolean validate(){
	
		if (!email.matches("\\w+@\\w+\\.\\w+")){
			message = "Email not valid";
			return false;
		}
		else if (email.matches("\\w*\\s\\w*")){
			message = "Email can not contain space(s)";
			return false;
		}
		else if(password.length() < 7){
			message = "Password length should be 7 or more characters";
			return false;
		}
		return true;
	}

}