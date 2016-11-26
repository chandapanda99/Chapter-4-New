
/**
 * Write a description of class Address here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Address
{
    private String streetAddress, city, state;
    private int zipCode;
    
    /**
     * Sets up this Address object with the data
     */
    public Address (String street, String town, String st, int zip)
    {
        streetAddress = street;
        city = town;
        state = st;
        zipCode = zip;
    }
    
    /**
     * Returns this Address object as a string
     */
    public String toString()
    {
        String result;
        
        result = streetAddress + "\n";
        result += city + ", " + state + " " + zipCode;
        
        return result;
    }
}
