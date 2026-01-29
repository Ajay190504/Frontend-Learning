package classesAndObjects.samepkg;

public class Main {


	//Can create objects of class in same package directly without import
	
	public static void main(String[] args) {

		Student payal = new Student();

		int a = payal.studentId = 245;
		String b = payal.name = "payal";
		String c = payal.city = "pune";

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println("-------------------------");

		Student dnayesh = new Student(); //class within same package, so no need to import, can create object directly

		int d = dnayesh.studentId = 241;
		String e = dnayesh.name = "dnayesh";
		String f = dnayesh.city = "kamsheth";

		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

	}

}



