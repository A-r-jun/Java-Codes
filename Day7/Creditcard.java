import java.util.Scanner;


public interface Creditcard {
	public void payment(float amount);

}

class Rupees implements Creditcard
{

	public void payment(float amount) 
	{
		System.out.println("User payed "+amount +" from Credit card in rupees" );
	}
}

class Doller implements Creditcard
{

	public void payment(float amount) 
	{
		System.out.println("User payed "+amount +" from Credit card in doller" );
	}
}
class Pound implements Creditcard
{

	public void payment(float amount) 
	{
		System.out.println("User payed "+amount +" from Credit card in pound" );
	}
}


class Bankaccount 
{ 	static float amount; 
	static Scanner s= new Scanner(System.in);

	public static Creditcard Objcreate(){
		
		System.out.println("In what currency you would like to pay \n for Rupees press : r \n for Doller press : d \n for Pound press : p");
		String cls = s.next();
		if(cls.equals("r"))
			return new Rupees() ;
		if(cls.equals("d"))
			return new Doller() ;
		if(cls.equals("p"))
			return new Pound() ;
		return null;
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter amount");
		amount =s.nextFloat();
	
		Creditcard c=Objcreate();
		c.payment(amount);
		
		
	}
	
	
}