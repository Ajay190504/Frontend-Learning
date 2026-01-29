package day1;

//Average of three numbers
import java.util.Scanner;
public class Average {

  public static void main(String args[]){
  	Scanner sc = new Scanner(System.in);
  	int n1 = sc.nextInt();
  	int n2 = sc.nextInt();
  	int n3 = sc.nextInt();

  	float avg = (n1+n2+n3)/3.0f;

  	System.out.println("Average of Three Numbers : "+avg);
  	sc.close();
  }
}
