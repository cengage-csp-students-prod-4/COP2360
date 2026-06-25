import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PurchasesArrayListWithTotals
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        ArrayList<Purchase> purchases = new ArrayList<Purchase>();

        String category;
        double price;
        final String QUIT = "ZZZ";

        System.out.print("Enter category for purchase or " + QUIT + "to quit >> ");
        category = kb.nextLine();

        while(!category.equals(QUIT))
        {
            System.out.print("Enter amount spent >> ");
            price = kb.nextDouble();
            kb.nextLine();

            purchases.add(new Purchase(category, price));

            System.out.print("Enter category for purchase or " + QUIT + " to quit >> ");
            category = kb.nextLine();
        }
        
        Collections.sort(purchases);

        String currentCategory = "";
        double total = 0;

        for(int i = 0; i < purchases.size(); i++)
        {
            Purchase p = purchases.get(i);
            
            if(!p.getCategory().equals(currentCategory))
            {
                if(i > 0)
                {
                    System.out.println("   Total for " + currentCategory + ": " + total);
                }

                currentCategory = p.getCategory();
                total = 0;
            }

            System.out.println(p);
            total += p.getPrice();
        }

        if(purchases.size() > 0)
        {
            System.out.println("   Total for " +
            currentCategory + ": " + total);
        }
}
}