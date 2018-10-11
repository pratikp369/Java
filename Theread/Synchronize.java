package Theread;
import java.util.Scanner;
import java.lang.Runnable;

class Account
{
	private int balance;
	Account(int b)
	{
		balance=b;
	}
	public boolean isSuff(int w)
	{
		if(balance>w)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void withdraw(int am)
	{
		balance = balance-am;
		System.out.println("Withdraw money :"+am);
		System.out.println("Your current balace is :"+balance);
	}
}
class Customer implements Runnable
{
	private Account acc;
	private String name;
	private int amt;
	public Customer(Account acc,String name)
	{
		this.acc=acc;
		this.name=name;
	}
	public void run()
	{
      
       
       synchronized(acc)
       {
    	   Scanner sc = new Scanner(System.in);
    	      System.out.println(name +"Enter amount to withdraw :");
    	       int amt=sc.nextInt();
	if(acc.isSuff(amt))
	{
		System.out.println("Name :"+name);
		acc.withdraw(amt);
	}
	else
	{
		System.out.println("Insufficeient Balance");
	}
	}
	}
}
public class Synchronize {

	public static void main(String[] args) {

Account a1 = new Account(1000);		
Customer c1=new Customer(a1,"raj");
Customer c2= new Customer(a1,"simran");
Thread th1 = new Thread(c1);
Thread th2 = new Thread(c2);
th1.start();
th2.start();
	}

}
