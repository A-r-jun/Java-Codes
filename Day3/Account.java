
public class Account 
{
		
		int accno;
		String accname;
		float amount;
		
	public Account(int accno,String accname,float amount) 
	{
		this.accno = accno;
		this.accname = accname;
		this.amount =amount;
			
	}
	public static void Method()
	{
		
	}
	public void withdraw(int withdraw)
	{
			amount =amount-withdraw;
	System.out.println("You withdraw :"+withdraw +" and the current balance is :"+amount );
			
	}
	public void deposit(int deposit )
	{  amount = amount + deposit;
		System.out.println("You withdraw :"+ deposit +" and the current balance is :"+amount );
	}	
	public void interest()
	{
		float interest =amount*0.04f;
	System.out.println("The interest you will get is "+interest);
	}
	
	public static void main(String[] args) 
{
		Account a =new Account(1, "jun" , 10000);
		a.deposit(2000);
		a.withdraw(5000);
		a.interest();
			
		
}
	
}
