import java.util.Scanner;
public class ThrowUsedCarException
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        UsedCar[] cars = new UsedCar[7];

        String vin;
        String make;
        int year;
        int mileage;
        double price;

        for(int i = 0; i < cars.length; i++)
        {
            try
            {
                System.out.print("Enter 4 digit VIN >> ");
                vin = input.nextLine();

                System.out.print("Enter make >> ");
                make = input.nextLine();

                System.out.print("Enter year >> ");
                year = input.nextInt();

                System.out.print("Enter mileage >> ");
                mileage = input.nextInt();
                System.out.print("Enter price >> ");
                price = input.nextDouble();

                input.nextLine();

                cars[i] = new UsedCar(vin, make, year, mileage, price);
            }
            catch(UsedCarException e)
            {
                System.out.println("Object creation error: " + e.getMessage());
            }
            catch (Exception e)
            {
                System.out.println("Data entry error");
                input.nextLine();
            }
        }
        System.out.println("\nGood used car values");
        for(int i =0; i < cars.length; i++)
        {
            if(cars[i] != null)
            {
                System.out.println("VIN " + cars[i].getVin() + " Make: " + cars[i].getMake());
                System.out.println(" Year: " + cars[i].getYear() + " " + cars[i].getMileage() + " miles  $" + (int)cars[i].getPrice());
            }
        }
        input.close();
    }
}