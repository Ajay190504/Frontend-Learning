import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maths = sc.nextInt();
		int chemistry = sc.nextInt();
		int history = sc.nextInt();
		int computer = sc.nextInt();
		int english = sc.nextInt();
		
		int total = maths+chemistry+history+computer+english;
		
		float avg = total/5.0f;
		
		System.out.println("Total Marks: "+total);
		System.out.println("Average Marks: "+avg);
		
		sc.close();
		
			
		
		

	}

}
