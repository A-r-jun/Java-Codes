import java.util.Scanner;


public class Primeno_limit {
			
	public static void main(String[] args) 
	{
		Scanner s= new Scanner (System.in);
		int limit=0;
		System.out.println("Enter the limit");
		limit=s.nextInt();



			int n=2,flag=0;
		for(;n<limit;n++)
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
					flag=1;			
			}
			if(flag==0)
				System.out.println(n);
				
			flag=0;
		}
	
		s.close();
	}
		
}
