
/**
 * Write a description of class StudentBody here.
 * 
 * Aayush Chanda 
 * @version (a version number or a date)
 */
import java.util.*;
public class StudentBody
{
    /**
     * Creates some Address and Student objects and prints them
     */
    public static void main (String [] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        
        final Address school = new Address("440 Aurora Ave", "Naperville", "IL", 60540);
        
        Address hHome = new Address ("21 Jump Street", "Lynchburg", "VA", 24551);
        Address uHome = new Address ("123 Main Street", "Euclid", "OH", 44132);
        Student hayes = new Student ("Kevin", "Hayes", hHome, school);
        Student ulus = new Student ("Calc", "Ulus", uHome, school);
        System.out.print("Enter first name: ");
        String fname = Keyboard.nextLine();
        System.out.print("Enter last name: ");
        String lname = Keyboard.nextLine();
        System.out.print("Enter Address: ");
        String home = Keyboard.nextLine();
        System.out.print("Enter Town/City: ");
        String place = Keyboard.nextLine();
        System.out.print("Enter State (Initials): ");
        String stat = Keyboard.nextLine();
        System.out.print("Enter area code: ");
        int code = Keyboard.nextInt();
        Address nameadd = new Address(home, place, stat, code);
        Student name = new Student (fname, lname, nameadd, school);
        
        System.out.println(hayes);
        System.out.println();
        System.out.println(ulus);
        System.out.println();
        System.out.println(name);
    }
}
