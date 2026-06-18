public class UsedCarException extends Exception {
    public UsedCarException(String vin)
    {
        super("Error in used car #" + vin);
    }
}