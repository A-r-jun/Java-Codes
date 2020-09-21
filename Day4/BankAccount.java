
public class BankAccount 
{
	int accno;
	float balance;
	
	public BankAccount(int accno,float balance) 
	{
	this.accno = accno;
	this.balance =balance;
		
	}
	
	public void withdraw(int withdrawn)
	{
		balance =balance-withdrawn;
		System.out.println("You withdrawn :"+withdrawn +" and the current balance is :"+balance );
		
	}
	public void deposit(int deposit )
	{ 
		balance = balance + deposit;
		System.out.println("You deposited :"+ deposit +" and the current balance is :"+balance );
	}	
	public void getbalance()
	{
		System.out.println("Account no :"+accno+" Balance :"+balance);
	}
	
//	public void interest()
//	{
//		float interest =balance*0.04f;
//		System.out.println("The interest you will get is "+interest);
//	}

//		public static void main(String[] args) 
//{
//			BankAccount a =new BankAccount(1, 10000);
//			a.deposit(2000);
//			a.withdraw(5000);
//}

	
}

class CheckingAccount extends BankAccount
{
	

	int fee = 100;
	int transaction;
	
	public CheckingAccount(int accno, float balance,int transaction) 
	{
		super(accno, balance);
				this.transaction=transaction;

	}

	public void deductfee()
	{
		if(transaction>2)
			balance=balance-fee;
	System.out.println("you have exceeded the free transaction limit an amount is deducted.");
	}
	
}


class SavingAccount extends BankAccount
{
	float interestRate = 0.06f;
	
	public SavingAccount(int accno, float balance) {
		super(accno, balance);
		
	}
	
	public void addinterest()
	{
		balance =balance +balance*interestRate;
		System.out.println("The interest you got is "+interestRate*balance);
	}

}

class accounttest
{
	public static void main(String[] args) 
{
		
	
	SavingAccount s =new SavingAccount(1001, 10000);
	CheckingAccount c =new CheckingAccount(1002, 15000,0);
	s.getbalance();
	s.deposit(5000);
	s.withdraw(2000);
	s.addinterest();
	s.getbalance();
	
	
	c.deposit(5000);
	c.transaction++;
	c.withdraw(10000);
	c.transaction++;
	c.withdraw(1000);
	c.transaction++;
	c.deductfee();
	c.getbalance();
	

	
}
}