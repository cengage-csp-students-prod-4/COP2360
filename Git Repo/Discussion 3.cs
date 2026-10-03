public class Wine
{
    public decimal Price;
    public int Year;
    public WineType Type;

    public Wine(decimal price, int year, WineType type)
    {
        Price = price;
        Year = year;
        Type = type;  
    }
}

public enum WineType
{
    Red,
    White,
    Sparkling,
    Rose
}
class Program
{
    static void Main(string[] args)
    {
        Wine whiteWine = new Wine(18.99m, 2022, WineType.White);
        Wine redWine = new Wine(83.00m, 2000, WineType.Red);
        Wine roseWine = new Wine(15.79m, 2024, WineType.Rose);
        Wine sparklingWine = new Wine(30.99m, 2017, WineType.Sparkling);

        System.Console.WriteLine("**Wine Inventory List**");
        System.Console.WriteLine($"Wine Type: {redWine.Type} | Year: {redWine.Year} | Price: ${redWine.Price}");
        System.Console.WriteLine($"Wine Type: {whiteWine.Type} | Year:{whiteWine.Year} | Price: ${whiteWine.Price}");
        System.Console.WriteLine($"Wine Type: {roseWine.Type} | Year: {roseWine.Year} | Price: ${roseWine.Price}");
        System.Console.WriteLine($"Wine Type: {sparklingWine.Type} | Year: {sparklingWine.Year} | Price: ${sparklingWine.Price}");
    }
}