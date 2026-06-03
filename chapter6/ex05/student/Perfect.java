// Write your code here
import java.util.Scanner;
public class Perfect {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a maximum number >> "); 
    int max = input.nextInt();

    for (int number = 1; number <= max; number++) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number && number != 0) {
            System.out.println(number);
        }
    }
}