package inheritance.hybrid;

public class Daughter extends Father {
	private String propertyDaughter = "Lamborghini";
	void showDaughter() {
		System.out.println("This is son's property: "+this.propertyDaughter);
		System.out.println("I can access It");
	}
	
	public static void main(String[] args) {
		Daughter fth = new Daughter();
		fth.showGrand();
		fth.showFather();
		fth.showDaughter();
	}
}
