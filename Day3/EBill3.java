import java.util.Scanner;

//import java.util.Scanner;


public class EBill3 {
 
	static int cno=101;
	 String cname;
	 int units1;

	 EBill3(String n,int u )
	 {
		 cname= n;
		 units1=u;
 
	 }
	 
	 static void incCno()
	 {
		 cno++;	 
	 }
	 
	 
	 /*public void readData()
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter Customer details:");
		 cname= s.next();
		 units1=s.nextInt();
			
	 }*/
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

		
	/*	EBill3 c1 =new EBill3("A",101);
		c1.showData();
		incCno();
		System.out.println(c1.computeBill(c1.units1));
		
		EBill3 c2 =new EBill3("B",320); 
		c2.showData();
		incCno();
		System.out.println(c2.computeBill(c2.units1));

		EBill3 c3 =new EBill3("C",620);
		c3.showData();
		incCno();
		System.out.println(c3.computeBill(c3.units1));
		
		*/
		EBill3[] c= new EBill3[2];
		
	// Customer no is Static 
	// and is incremented by using static method - incCno
	//Constructor is used to input data  
		
		
		Scanner s=new Scanner(System.in);
		for (int i=0;i<2;i++)
		{	 
			System.out.println("Enter Customer details:");
				String cna;
				int uni;
			
			 cna= s.next();
			 uni=s.nextInt();
			 c[i] = new EBill3(cna,uni);
			 c[i].showData();
			 incCno();
			 System.out.println(c[i].computeBill(c[i].units1));
			
		}
		s.close();

		
}
	
}

