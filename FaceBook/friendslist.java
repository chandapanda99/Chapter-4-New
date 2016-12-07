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
    
    public String getFriend(String name, String id)
    {
        if (list.contains(name) && list.contains(id))
        {
            System.out.println("Contact is found");
        }
        else
        {
            System.out.println("Contact is not found");
        }
        
        System.out.println(name);
        System.out.println(id);
        return name;
    }
}