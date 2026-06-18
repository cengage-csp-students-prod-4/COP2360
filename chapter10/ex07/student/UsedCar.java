public class UsedCar {
    private String vin;
    private String make;
    private int year; 
    private int mileage;
    private double price;
    public UsedCar(String vin, String make, int year, int mileage, double price)
    throws UsedCarException {
        if(vin.length() != 4)
            throw new UsedCarException(vin);

        boolean validMake = false;

        if(make.equalsIgnoreCase("Ford"))
            validMake = true;
        else if(make.equalsIgnoreCase("Honda"))
            validMake = true;
         else if(make.equalsIgnoreCase("Toyota"))
            validMake = true;
         else if(make.equalsIgnoreCase("Chrysler"))
            validMake = true;
         else if(make.equalsIgnoreCase("Other"))
            validMake = true;

        if(!validMake)
            throw new UsedCarException(vin);
        if(year < 1997)
            throw new UsedCarException(vin);
        if(year < 2024)
            throw new UsedCarException(vin);
        if(mileage < 0)
            throw new UsedCarException(vin);
        if(price < 0)
            throw new UsedCarException(vin);

        this.vin = vin;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }
    public String getVin()
    {
        return vin;
    }
    public String getMake()
    {
        return make;
}
    public int getYear()
    {
        return year;
    }
    public int getMileage()
    {
        return mileage;
    }
    public double getPrice()
    {
        return price;
    }
}