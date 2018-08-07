import java.util.Scanner;
public class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int accountNumber=sc.nextInt();
		double balance=sc.nextInt();
		Account obj1=new Account(accountNumber,balance);
		System.out.println("enter credit ammount");
		double amount;
		amount=sc.nextDouble();
		obj1.credit(amount);
    System.out.println("enter debit ammount");
		amount=sc.nextDouble();
		obj1.debit(amount);
		String s=obj1.toString();
		System.out.println(s);

		accountNumber=sc.nextInt();
		Account obj2=new Account(accountNumber);
		balance=sc.nextDouble();
		obj2.setBalance(balance);
		System.out.println("enter credit ammount");
    amount=sc.nextDouble();
		obj2.credit(amount);
		System.out.println("enter debit ammount");
    amount=sc.nextDouble();
		obj2.debit(amount);
		s=obj2.toString();
    System.out.println(s);
	}
}
