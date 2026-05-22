import java.util.Scanner;

public class ElectionStatistics {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name of 1st Party >> ");
        String party1 = input.nextLine();
        System.out.println("Enter # of received votes >>");
        int votes1 = input.nextInt();
        input.nextLine();

        System.out.println("Enter name of 2nd party >>");
        String party2 = input.nextLine();
        System.out.println("Enter # of recieved votes >>");
        int votes2 = input.nextInt();
        input.nextLine();

        System.out.println("Enter name of 3rd party >>");
        String party3 = input.nextLine();
        System.out.println("Enter # of recieved votes >>");
        int votes3 = input.nextInt();

        double totalvotes = votes1 + votes2 +votes3;
        double pct1 = (votes1 / totalvotes) * 100;
        double pct2 = (votes2 / totalvotes) * 100;
        double pct3 = (votes3 / totalvotes) * 100;

        System.out.println("The" + party1 + "received" + pct1 + "% of the vote.");
        System.out.println("The" + party2 + "received" + pct2 + "% of the vote.");
        System.out.println("The" + party3 + "received" + pct3 + "% of the vote.");
    }

    
}