import java.util.Scanner;


public class Sum 
{
	
public static void main(String[] args) 
{
	int num1;
	int num2;
	Scanner s = new Scanner(System.in);

	num1=s.nextInt();
	num2=s.nextInt();
		
	
	int total= num1 +num2 ;
	System.out.println(total);

	s.close();
}
}
