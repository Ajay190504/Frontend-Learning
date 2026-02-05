package inheritance.hybrid;

public class Son extends Father{
	private String propertySon = "Rolls Royce";
	void showSon() {
		System.out.println("This is son's property: "+this.propertySon);
		System.out.println("I can access It");
	}
	
	public static void main(String[] args) {
		Son fth = new Son();
		fth.showGrand();
		fth.showFather();
		fth.showSon();
	}
}
