import java.util.Scanner;


public class Calc {

	public static void main(String[] args) 
{
		Scanner s =new Scanner(System.in);
	 
		int num1,num2;
		int  choice;
		
		System.out.println("Enter the first no:");
		num1=s.nextInt();
		System.out.println("Enter the second no:");
		num2=s.nextInt();
		System.out.println("What you wanna do : add , sub, div or mult ");
		choice=s.next().charAt(0);
		
	//	System.out.println(choice);
		switch(choice){
		
		case 97: //add
			System.out.println(num1+num2);
				break;
		case 115://sub
			System.out.println(num1-num2);	
			break;
		case 100://div
			System.out.println(num1/num2);
				break;
		case 109://mult 
			System.out.println(num1*num2);
		break;
		}

		s.close();
		
		
		
}
	
}
