import java.util.Scanner;


public class Swap {

	public static void main(String[] args) {
		
		int num1,num2,temp;
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the First no");
		num1=s.nextInt();
		
		System.out.println("Enter the Second no");
		num2=s.nextInt();
	//	System.out.println("First no:" + num1 "Second no:" + num2 );
		
		temp=num2;
		num2=num1;
		num1=temp;
		
		System.out.println("The no are swapped");
		System.out.println("First no:" + num1  );
		System.out.println("Second no:"+num2 );	
	
		s.close();
	}
	
	
	
}
