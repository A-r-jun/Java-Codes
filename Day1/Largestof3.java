import java.util.Scanner;


public class Largestof3 {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		int num1,num2,num3 = 0;
		
		System.out.println("Enter the 1st no:");
		num1=s.nextInt();
	
		System.out.println("Enter the 2nd no:");
		num2=s.nextInt();
		
		System.out.println("Enter the 3rd no:");
		num1=s.nextInt();
		
		int max;
		
		max =num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
		System.out.println(max);
	
		
		s.close();
	}
	
	
	
}
