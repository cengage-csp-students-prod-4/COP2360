// Write your code here
import java.util.Scanner;

public class alphabetize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string >> ");
        String str1 = input.nextLine();
        System.out.print("Enter second string >> ");
        String str2 = input.nextLine();
        System.out.print("Enter third string >> ");
        String str3 = input.nextLine();

        if (str1.compareToIgnoreCase(str2) <= 0 && str2.compareToIgnoreCase(str3) <= 0) {
            System.out.println("Yes, the strings entered are in alphabetical order");
        } else {
            System.out.println("No. te strings entered are not in alpabetical order");
        }

    }
}