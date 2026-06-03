// Write your code here
import java.util.Scanner;
public class Perfect {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a maximum number >> "); 
    int max = input.nextInt();

    for (int num = 1; num <= max; num++) {
        if (isPerfect(num)) {
            System.out.println("The number " + num + " is perfect");
        }
    }
    input.close();
}

public static boolean isPerfect(int n) {
    if (n < 2) return false;
    int sum = 0;
    for (int i = 1; i <= n / 2; i++) {
        if (n % 1 == 0) {
            sum += i;
        }
    }
    return sum == n;
}
}

