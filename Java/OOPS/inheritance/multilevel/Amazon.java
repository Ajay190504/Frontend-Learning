package inheritance.multilevel;

public class Amazon {
	String userName;
	String password;
	void createAccount(String userName, String password) {
		this.userName=userName;
		this.password=password;
		System.out.println("Account create successfully!");
	}
	
	void login(String userName, String password) {
		if(this.userName==userName && this.password==password) {
			System.out.println("Login Successful");
			this.welcome();
		}
	}
	void welcome() {
		System.out.println("Welcome to Amazon "+this.userName);
	}
}
