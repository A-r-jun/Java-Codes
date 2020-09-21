import java.util.Scanner;


public class Array_sum {
	 public static void main(String[] args) 
	    {
	        int n, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("no. of elements ");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	            sum = sum + a[i];
	        }
	        System.out.println(sum);
	        
	        s.close();
	    }

}
