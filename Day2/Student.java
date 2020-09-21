import java.util.Scanner;


public class Student 
{
	int id;
	String name;
	int mark;
	String result;
	
	public void readStudent()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Student Details :");
		id=s.nextInt();
		name=s.next();
		mark=s.nextInt();
		
	
	}

	public void dispStudent()
	{
		System.out.println("Student Details :");
		System.out.println("Id : "+ id);
		System.out.println("Name : "+ name);
		System.out.println("Mark : "+ mark);
		System.out.println("Result : " + result);		
	}
	public void findResult()
	{
		if(mark>=35)
			result= "Pass";
		else 
			result ="Fail";
		
	}
	
	
	public static void main(String[] args)
{
	 Student s1 =new Student();
	 Student s2= new Student();
	 
	/* Student[] s=new Student();
	 for(int i=0;i<2;i++) //Object Array
	 {
		s[i]=new Student();
		 
	 }*/
	 
	 s1.readStudent();
	 s1.findResult();
	 s1.dispStudent();	
	
	 s2.readStudent();	
	 s2.findResult();
	s2.dispStudent();	
	 
}
	
}
