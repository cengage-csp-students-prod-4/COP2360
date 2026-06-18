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

    System.out.print("Enter size >> ");
    shirt1.setSize(input.nextLine())

     System.out.print("Enter order number >> ");
    shirt2.setOrderNumber(input.nextLine()) 
    input.nextLine();

    System.out.print("Enter color >> ");
    shirt2.setColor(input.nextLine());

    System.out.print("Enter size >> ");
    shirt2.setSize(input.nextLine());

   System.out.print("Enter order number >> ");
    custom1.setOrderNumber(input.nextInt());
    input.nextLine();

     System.out.print("Enter color >> ");
    custom1.setColor(input.nextLine());

    System.out.print("zEnter size >> ");
    custom1.setSize(input.nextLine());

    System.out.print("Enter slogan for shirt >> ");
    custom1.setSlogan(input.nextLine());

     System.out.print("Enter order number >> ");
    custom2.setOrderNumber(input.nextInt());
    input.nextLine();

     System.out.print("Enter color >> ");
    custom2.setColor(input.nextLine());

    System.out.print("zEnter size >> ");
    custom2.setSize(input.nextLine());

    System.out.print("Enter slogan for shirt >> ");
    custom2.setSlogan(input.nextLine());


    



}