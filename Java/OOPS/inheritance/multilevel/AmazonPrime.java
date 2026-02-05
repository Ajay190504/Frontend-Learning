package inheritance.multilevel;

public class AmazonPrime extends AmazonShopping{
	String content;
	void show() {
		System.out.println("Welcome to Amazon Prime");
	}
	
	void watch(String content) {
		this.content=content;
		System.out.println("Watching: "+this.content);
	}
	
	public static void main(String[] args) {
		AmazonPrime acc1 = new AmazonPrime();
		acc1.createAccount("Ajay123", "Ajay@2640");
		acc1.login("Ajay123","Ajay@2640");
		acc1.show();
	  //acc1.buyProduct("Watch");
		acc1.watch("IPL");
		
	}
}
