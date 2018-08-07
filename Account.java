import java.util.Scanner;
public class Account
{
private int accountNumber;
private double balance;
Account(int accountNumber)
{
 this.accountNumber=accountNumber;
 balance=0;
}
Account(int accountNumber,double balance)
{
this.accountNumber=accountNumber;
this.balance=balance;
}
public int getAccountNumber()
{
	return accountNumber;
}
public void setBalance(double balance)
{
	this.balance=balance;
}
public double getBalance()
{
	return balance;
}
public void credit(double amount)
{
	balance+=amount;
}
public void debit(double amount)
{
	if(balance>=amount)
		balance-=amount;
	else
	  System.out.println("Balance is less than withdrwl ammount");
}
public String toString()
{
	String s;
	s="A/C no:"+getAccountNumber()+", Balance=$"+getBalance()+".With balance rounded to two decimal places.";
return s;
}
}
