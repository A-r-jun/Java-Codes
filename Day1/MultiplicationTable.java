import java.util.Scanner;


public class MultiplicationTable {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num;
		System.out.println("Enter the no");
		num=s.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num + "x" + i + "=" + num*i  );
			
		}
		
		s.close();
	}

}
