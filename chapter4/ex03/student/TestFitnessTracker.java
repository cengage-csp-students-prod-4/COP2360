import java.util.Scanner;
import java.time.LocalDate;

public class TestFitnessTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        FitnessTracker tracker1 = new FitnessTracker();

        System.out.print("Enter activity: ");
        String act = input.nextLine();
        System.out.print("Enter minutes: ");
        int min = input.nextInt();
        System.out.print("Enter month (1-12):");
        int month = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();
        System.out.print("Enter year:");
        int year = input.nextInt();

        LocalDate userdate = LocalDate.of(year, month, day);
        FitnessTracker tracker2 = new FitnessTracker(act, min, userdate);

        display(tracker1);
        display(tracker2);
    }
public static void display(FitnessTracker ft) {
    System.out.println("Activity: " + ft.getActivity());
    System.out.println("Minutes: " + ft.getMinutes());
    System.out.println("Date: " + ft.getDate());
     
}
}
