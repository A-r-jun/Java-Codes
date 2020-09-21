import java.util.Scanner;


public class Arry_reverse {
	
	
	public static void main(String[] args) 
{
		Scanner s= new Scanner(System.in);
		int n=0,temp=0;
		System.out.println("Enter the No of Elements");
		n=s.nextInt();
		int[] array = new int [n];
		
		System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.println("Printing Array:");
        for(int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }
        
        for(int i = 0; i < n; i++) // Reverse
        { 
        	temp=array[(n-1)]; 
        	array[(n-1)-i]=array[i];
        	array[i]=temp; 
        }
        
        
        System.out.println("Printing Reversed Array:");
        for(int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }   
     
        
}
}
