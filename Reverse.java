import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int num=0, rem=0,rev=0;
		Scanner s =new Scanner(System.in);
		
		num=s.nextInt();
		
		while(num!=0)
		{ 
			rem=num%10;
			rev=10*rev+rem;
			num= num/10;
			
		}
		System.out.println(rev);
		s.close();	
	}
}
