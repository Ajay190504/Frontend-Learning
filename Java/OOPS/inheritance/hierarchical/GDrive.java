package inheritance.hierarchical;

public class GDrive extends Google {
	
	void saveToDrive(){
		System.out.println("Your file saved to Google Drive");
	}
	public static void main(String[] args) {
		
		GDrive gd1 = new GDrive();
		gd1.saveToDrive();
		
		System.out.println("Printing Parent Company details");
		gd1.printCmpName();
	}
}
