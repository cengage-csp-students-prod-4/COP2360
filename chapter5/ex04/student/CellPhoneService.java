import java.util.Scanner;
public class CellPhoneService {
    public static void main(String[] args) {
        scanner input = new Scanner(System.in);
     
         
        System.out.print("Enter maximum monthly talk minutes: ");
        int minutes = input.nextInt();
        System.out.print("Enter maximum monthly text minutes: ");
         int texts = input.nextInt();
         System.out.print("Enter maximum monthly gigabytes of data: ");
         int data = input.nextInt();

         String plan;
         int price; 
         if (data > 0) {
            if (data < 3) {
                plan = "plan E";
                price =79;
            } else {
                plan = "Plan F";
                price = 87;
            }
        }else if (minutes < 500) {
            if (texts == 0) {
                plan = "Plan A";
                price = 
        }

         }

    }
    
}lass