
public class SavingsAccount 
{
	private final double INTEREST_RATE = 0.004;
	private double balance;
	
	public SavingsAccount(double balance)
	{
		this.balance = balance;
	}
	
	public SavingsAccount()
	{
		
	}
	
	public void withdraw()
	{
		
	}
	
	public void deposit()
	{
		
	}
	
	public void addInterestToBalance()
	{
		balance += INTEREST_RATE * balance;
	}
}


/*   
Test the class in a program that calculates the balance of a savings account at the end of a period of time. 
It should ask the user for the annual interest rate, the starting balance, 
and the number of months that have passed since the account was established. 

A loop should then iterate once for every month, performing the following:
a. Ask the user for the amount deposited into the account during the month. 
Use the class method to add this amount to the account balance.

b. Ask the user for the amount withdrawn from the account during the month. 
Use the class method to subtract this amount from the account balance.

c. Use the class method to calculate the monthly interest.

After the last iteration, the program should display the ending balance, the total amount of deposits, 
the total amount of withdrawals, and the total interest earned.
*/