
public class Bank {

	public void getRateofinterest()
	{
	//	float interest =0.07f;
	//	System.out.println("The interest you will get in Bank is "+interest);
	}
	
}

class SBI extends Bank
{
	public void getRateofinterest()
	{
		float interest =0.06f;
		System.out.println("The interest you will get in SBI is "+interest);
	}
	
}

class ICICI extends Bank
{
	public void getRateofinterest()
	{
		float interest =0.04f;
		System.out.println("The interest you will get in ICICI is "+interest);
	}
	
}

class HDFC extends Bank
{
	public void getRateofinterest()
	{
		float interest =0.05f;
		System.out.println("The interest you will get in HDFC is "+interest);
	}
	
}

class methodoverridingBank
{
	public static void main(String[] args) 
	{
		SBI s=new SBI();
		ICICI i=new ICICI();
		HDFC h= new HDFC();
	
		s.getRateofinterest();
		i.getRateofinterest();
		h.getRateofinterest();
	
	}
	
}
