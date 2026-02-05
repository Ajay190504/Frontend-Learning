package inheritance.multilevel;

public class AmazonShopping extends Amazon {
	String productName;
	void buyProduct(String productName) {
		this.productName = productName;
		System.out.println("Product ordered successfully: "+this.productName);
	}
	
	public static void main(String[] args) {
		AmazonShopping acc1 = new AmazonShopping();
		
		acc1.createAccount("Ajay123", "Ajay@2640");
		acc1.login("Ajay123","Ajay@2640");
		acc1.buyProduct("Watch");
	}
}
