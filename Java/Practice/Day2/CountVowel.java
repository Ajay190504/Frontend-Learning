package day2;

//Program to count vowels in a string
public class CountVowel {
  public static void main(String[] args) {
      String str = "Hello World";
      int vowelCount = 0;

      // Convert the string to lowercase to handle both cases
      str = str.toLowerCase();

      for (int i = 0; i < str.length(); i++) {
          char ch = str.charAt(i);
          if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
              vowelCount++;
          }
      }

      System.out.println("Number of vowels in the string: " + vowelCount);
      
      /* Legth of string :
       1) str.length();
       2) using forEach loop
       	  for(char ch : str.tocharArray;
      	  length=0
      	for(char ch : str.toCharArray()) {
    	  length++;
      	}
       */
  }
}