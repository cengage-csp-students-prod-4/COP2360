public class Purchase implements Comparable<Purchase>
{
    private String category;
    private double price;

    public Purchase(String category, double price)
    {
        this.category = category;
        this.price = price;
    }
    public String getCategory()
    {
        return category;
    }

    public double getPrice()
    {
        return price;
    }
    @Override
    public int compareTo(Purchase other)
    {
        return category.compareTo(other.category);
    }

    @Override
    public String toString()
    {
        return category + " " + price;
    }
}