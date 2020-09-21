import java.util.Scanner;


public class ElecBill 
{
public static void main(String[] args)
	{
			Scanner s = new Scanner(System.in);
	
				int units;
			System.out.println("Enter the no of units");
			units = s.nextInt();
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
			
			System.out.println(bill);

			s.close();
			
	}

	
}
