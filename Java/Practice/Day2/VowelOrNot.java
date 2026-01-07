//Program for vowel or not using if else
import java.util.Scanner;
public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        // Convert to lowercase to handle both cases
        char lowerCh = Character.toLowerCase(ch);
        
        if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is not a vowel.");
        }
        
     //using ternary operator
      String str = (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u')? "is Vowel" : "is consonant";
      System.out.println(ch+" "+str);
        sc.close();
    }
}