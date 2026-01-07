//Program to count number of consonants in a string
public class CountConsonant {
    public static void main(String[] args) {
        String str = "Hello World";
        int consonantCount = 0;

        // Convert the string to lowercase to handle both cases
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a letter and not a vowel
            if ((ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                consonantCount++;
            }
        }

        System.out.println("Number of consonants in the string: " + consonantCount);
    }
}