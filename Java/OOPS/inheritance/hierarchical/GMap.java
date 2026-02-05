package inheritance.hierarchical;

public class GMap extends Google {
	
	void product() {
		System.out.println("This is Google Map");
	}
	 
	public static void main(String[] args) {
		
		GMap g2 = new GMap();
		g2.product();
		
		System.out.println("Printing Parent Company details");
		g2.printCmpName();
	}
}
