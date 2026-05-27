import java.util.Scanner;
public class NumbersDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("enter another integer >>");
        int num1 = input.nextInt();
        System.out.print("Enter another integer");
        int num2 = input.nextInt();

        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);

        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
            }
            public static void displayTwiceTheNumber(int n) {
                System.out.println(n + "times 2 is " + (n * 2));
                 }
                 public static void displayNumberPlusFive(int n) {
                    System.out.println(n + "plus 5 is" + (n + 5));
}
public static void displayNumberSquared(int n) {
 System.out.println(n + "squared is" + (n * n));    
}
}