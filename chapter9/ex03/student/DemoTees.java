import java.util.Scanner;

public class DemoTees
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        TeeShirt shirt1 = new TeeShirt();
        TeeShirt shirt2 = new TeeShirt();

        CustomTee custom1 = new CustomTee();
        CustomTee custom2 = new CustomTee();
    
    System.out.print("Enter order number >> ");
    shirt1.setOrderNumber(input.nextInt());
    input.nextLine();

    System.out.print("Enter color >> ");
    shirt1.setColor(input.nextLine());

    
}