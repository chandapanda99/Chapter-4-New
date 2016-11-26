
/**
 * Write a description of class Banking here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Banking
{
    /**
     * Creates some bank accounts and requests various services.
     */
    public static void main (String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);
        
        AccountClass acct1 = new AccountClass ("Aniket Chanda", 23175, 10209.56);
        AccountClass acct2 = new AccountClass ("Debasis Chanda", 25050, 400.00);
        AccountClass acct3 = new AccountClass ("Sugata Chanda", 12345, 759.32);
        
        acct1.deposit (25.85);
        
        double debBalance = acct2.deposit(500.00);
        System.out.println("Debasis Balance after deposit: " + debBalance);
        System.out.println("Debasis Balance after withdrawal: " + acct2.withdraw (430.75, 1.50));
        
        acct3.withdraw(800.00, 0.0);
        
        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();
        
        double aniBalance = acct1.getBalance();
        
        System.out.println("\n" + acct1);
        System.out.println(acct2);
        System.out.println(acct3);
        
        System.out.print("\nHow much should be transfered to Debasis? ");
        double dub = Keyboard.nextDouble();
        acct1.withdraw(aniBalance - dub, 0);
        acct2.deposit(dub);
        
        System.out.println("\n" + acct1);
        System.out.println(acct2);
        System.out.println(acct3);
    }
}
