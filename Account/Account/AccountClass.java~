/**
 * Class Code for Account Program
 * 
 * Aayush Chanda
 * Account Class
 */
import java.text.*;
public class AccountClass
{
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    private final double rate = 0.035; //Interest is 3.5%
    
    private int acctNumber;
    private double balance;
    private String name;
    
    /**
     * Sets up the account by defining an owner, acct number, and initial balance
     */
    public AccountClass (String owner, int account, double initial)
    {
        name = owner;
        acctNumber = account;
        balance = initial;
    }
    
    /**
     * Checks the transaction, then deposits amt into the acct 
     * @param return double balance
     */
    public double deposit (double amount)
    {
        if (amount < 0) {
            System.out.println("\nError: Deposit amount is invalid.");
            System.out.println(acctNumber + "" + fmt.format(amount));
        }
        else {
            balance = balance + amount;
        }
        
        return balance;
    }
    
    /**
     * Checks transaction again, but this time withdraws the amt from the account
     * @param return double balance
     */
    public double withdraw (double amount, double fee)
    { 
        amount += fee;
        
        if (amount < 0) {
            System.out.println("\nError: Withdraw amount is invalid.");
            System.out.println("Account:" + acctNumber);
            System.out.println("Requested: " + fmt.format(amount));
        }
        else {
            if (amount > balance) {
                System.out.println("\nError: Insufficient funds.");
                System.out.println("Account: " + acctNumber);
                System.out.println("Requested: " + fmt.format(amount));
                System.out.println("Available: " + fmt.format(balance));
            }
            else {
                balance = amount;
            }
        }
        return balance;
    }
    
    /**
     * Adds interest to the acct
     * @param return double balance
     */
    public double addInterest()
    {
        balance += (balance * rate);
        return balance;
    }
    
    /**
     * @param return double balance
     */
    public double getBalance()
    {
        return balance;
    }
    
    /**
     * @param return accNumber;
     */
    public int getAccountNumber()
    {
        return acctNumber;
    }
    
    /**
     * @param toString method
     */
    public String toString()
    {
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}