//Concrete Class
public class Bank extends Account implements Transaction 
{
	//Constructor
    Bank(String acc_name, int acc_no, double balance) 
    {
        super(acc_name, acc_no, balance);
    }
    @Override
    public void deposit(double amount) 
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("\n" + amount + " Deposited Successfully!");
        } else 
        {
            System.out.println("\nInvalid amount! Deposit must be greater than zero.");
        }
    }
    @Override
    public void withdraw(double amount) 
    {
        if (amount <= 0) 
        {
            System.out.println("\nInvalid withdrawal amount!");
        }
        else if (amount > balance) 
        {
            System.out.println("\nInsufficient Balance!");
        } else
        {
            balance -= amount;
            System.out.println("\n" + amount + " Withdrawn Successfully!");
        }
    }
    @Override
    public void viewBalance() {
        System.out.println("\nCurrent Balance: " + balance);
    }
	@Override
    public void viewAccountDetails() {
        System.out.println("\n----- ACCOUNT DETAILS -----");
        System.out.println("Account Holder Name : " + acc_name);
        System.out.println("Account Number      : " + acc_no);
        System.out.println("Available Balance   : " + balance);
        System.out.println("---------------------------");
    }
}
