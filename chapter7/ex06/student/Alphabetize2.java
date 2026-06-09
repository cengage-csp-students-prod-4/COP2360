// Write your code here
import java.util.Scanner;
import java.util.Arrays;

public class Alphabetize2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[3];

        System.out.print("Enter first string >> ");
        words[0] = input.nextLine();
        System.out.print("Enter second string >> ");
        words[1] = input.nextLine();
        System.out.print("Enter third string >> ");
        words[2] = input.nextLine();

        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        System.out.println("The strings in alphabetical order are:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}