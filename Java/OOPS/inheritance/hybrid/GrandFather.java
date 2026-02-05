package inheritance.hybrid;

public class GrandFather {
	private String propertyGrand = "10 acre Land";
	void showGrand() {
		System.out.println("This is grandfather's property: "+this.propertyGrand);
		System.out.println("I can access It");
	}
}
