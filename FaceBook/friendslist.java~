/*
 * Aayush Chanda
 * friendslist
 */
import java.util.ArrayList;

public class friendslist {
    private String nic, num;
    
    public ArrayList<String> list = new ArrayList<String>();
    
    
    public void setList(String name, String id)
    {
        nic = name;
        num = id;
    }
    
    public String getName()
    {
        return nic;
    }

    public String getID()
    {
        return num;
    }
    
    public void addFriend()
    {   
        list.add(nic);
        list.add(num);
    }
    
    public void removeFriend()
    {
        list.remove(nic);
        list.remove(num);
    }
    
    public String getFriend(String name)
    {
        if (list.contains(name))
        {
            System.out.println("Name is found");
        }
        else
        {
            System.out.println("Name is not found");
        }
        return name;
    }
}