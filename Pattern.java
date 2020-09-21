import java.util.Scanner;


public class Pattern {

	public static void main(String[] args) 
{
		Scanner s =new Scanner(System.in);
		int lines;
		System.out.println("Enter the no of lines");
		lines = s.nextInt();
		
		for(int i=1; i<=lines;i++)
		{ 
			for(int j=0;j<i;j++)
				{System.out.print("*");
			
				}
			System.out.println("");
		}
		for(int i=lines-1; i>=1;i--)
		{ 
			for(int j=0;j<i;j++)
				{System.out.print("*");
			
				}
			System.out.println("");
		}
		
		
		
		s.close();
		
		

}
	
	
	
}
