/*
 * Aayush Chanda
 * Facebook
 */

import java.util.*;
import java.text.*;
import javax.swing.text.MaskFormatter; 
import java.awt.*;


public class Facebook
{
    public static void main(String[] args) 
    {
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.println("\n1.Add a friend");
        System.out.println("2.Remove a friend"); 
        System.out.println("3.Display all friends");
        System.out.println("4.Search for a friend");
        System.out.println("5.Exit Program\n");
        
        int choice = Keyboard.nextInt();
        
        friendslist friendlist = new friendslist();
        
        
        while (choice != 5)
        {
            int number = 0;
          
            if (choice == 1)
            {
                System.out.print("Nickname: ");
                String name = Keyboard.next();
                System.out.print("Contact #: ");
                String id = Keyboard.next();
                friendlist.setList(name, id);
                friendlist.addFriend();
            }
            
            else if (choice == 2)
            {
                System.out.print("Nickname: ");
                String name = Keyboard.next();
                System.out.print("Contact #: ");
                String id = Keyboard.next(); 
                friendlist.setList(name, id);
                friendlist.removeFriend();
            }
            
            else if (choice == 3)
            {
                for(int x= 0; x < 1; x++)
                {
                    System.out.println(friendlist.list);
                }
            }
            
            else if (choice == 4)
            {
                System.out.print("Nickname: ");
                String name = Keyboard.next();
                System.out.print("Contact #: ");
                String id = Keyboard.next();
                friendlist.getFriend(name, id);
            }
          
                System.out.println("\n\n1.Add a friend");
                System.out.println("2.Remove a friend"); 
                System.out.println("3.Display all friends");
                System.out.println("4.Search for a friend");
                System.out.println("5.Exit Program\n");
                choice = Keyboard.nextInt(); 
        }
    }  
}