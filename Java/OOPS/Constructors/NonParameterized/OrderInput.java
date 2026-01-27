import java.util.Scanner;
public class OrderInput{

    public OrderInput() {
        System.out.println("Enter a number: ");
    }
 
    public static void main(String[] args) {
       OrderInput oi = new OrderInput();
    	Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Entered Number: "+num);
        sc.close();
        
        
    }
}