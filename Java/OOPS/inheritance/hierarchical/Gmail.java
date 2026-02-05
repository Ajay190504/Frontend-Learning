package inheritance.hierarchical;

public class Gmail extends Google {
	
	void sendMail() {
		System.out.println("Mail sent using Gmail");
	}

	public static void main(String[] args) {
		
		Gmail gm1 = new Gmail();
		gm1.sendMail();
		System.out.println("Printing Parent Company details");
		gm1.printCmpName();

	}

}
