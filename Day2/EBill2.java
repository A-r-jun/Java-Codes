import java.util.Scanner;


public class EBill2 {
 
	 int cno;
	 String cname;
	 static int units1;
	 
	 
	 public void readData()
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter Customer details:");
		 cno=s.nextInt();
		 cname= s.next();
		 units1=s.nextInt();
		 
		
	 }
	public void showData()
	{
		System.out.println("Customer details:");
		System.out.println("No.:" +cno);
		System.out.println("Name: "+cname);
		System.out.println("Units Consumed :"+units1);		
	}
	
	public float computeBill(int units)
	{   
		float bill=0;
		//	System.out.println(units);
			if(0<units && units<=100)
			{
				bill=units*1.2f;
			System.out.println(units+"*1.2 =");
			}
			else if(100<units && units<=300)
			{
				units-=100;
				bill=( 120) + units*2;
				System.out.println("100*1.20 +"+ units+ "*2 =");	
			}
			else if(300<units && units<=600)
			{
				units-=300;
				bill = (120+400) +( units*3);
				System.out.println("100*1.20 + 200*2+"+ units+"*3 =");
			
			}
			else if(units>600)
			{
				units-=600;
				bill = (1420)+(units*5);
			}
			
			return bill;
	
	}
	
	public static void main(String[] args) 
{
		EBill2 c1 =new EBill2();
		
		c1.readData();
		c1.showData();
		System.out.println("Bill is :" +c1.computeBill(units1));
		
EBill2 c2 =new EBill2();
		
		c2.readData();
		c2.showData();
		System.out.println("Bill is :" +c2.computeBill(units1));
		
}
	
}
