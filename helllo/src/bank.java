import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// bank.java
// demonstrates basic OOP syntax
// to run this program: C>java BankApp
////////////////////////////////////////////////////////////////
class BankAccount
{
 double balance; // account balance
public BankAccount(double openingBalance) // constructor
{
balance = openingBalance;
}
public void deposit(double amount) // makes deposit
{
balance = balance + amount;
}
public void withdraw(double amount) // makes withdrawal
{
balance = balance - amount;
}
public void display() // displays balance
{
System.out.println("balance=" + balance);
}



} // end class BankAccount


class BankApp
{
	public static String getString() throws IOException
	{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String s = br.readLine();
	return s;
	}	
	
	public static int getInt() throws IOException
	{
	String s = getString();
	return Integer.parseInt(s);
	}
	public static double getDouble() throws IOException
	{
	String s = getString();
	Double aDub = Double.valueOf(s);
	return  aDub.doubleValue();
	}
	
	
public static void main(String[] args) throws IOException
{
	
	int[] intArray = new int[100];
BankAccount ba1 = new BankAccount(100.00); // create acct
System.out.println("Before transactions, ");
ba1.display(); // display balance
ba1.deposit(74.35); // make deposit
ba1.withdraw(20.00); // make withdrawal
System.out.println("After transactions, ");
ba1.display(); // display balance
System.out.println("the printing thorough native object is "+ ba1.balance);
String abc = getString();
System.out.println(abc);
int a = getInt();
System.out.println(a);
System.out.println(getDouble());

} // end main()
} // end class BankApp