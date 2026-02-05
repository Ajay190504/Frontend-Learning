package inheritance.hybrid;

public class Father extends GrandFather {
	private String propertyFather = "Banglo";
	void showFather() {
		System.out.println("This is father's property: "+this.propertyFather);
		System.out.println("I can access It");
	}
	
	public static void main(String[] args) {
		Father fth = new Father();
		fth.showGrand();
		fth.showFather();
	}
}
