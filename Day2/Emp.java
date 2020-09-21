import java.util.Scanner;


public class Emp

{
		int empno;
        String empname;
        String designation	;
        String department;
        int sal;	
    
    public void readEmpData()
	{
		Scanner s = new Scanner(System.in);
		empno= s.nextInt();
		empname = s.next();
		designation = s.next();
		department = s.next();
		sal =s.nextInt();
		s.close();
    	
	}
    
    public void DisplayEmpData()
	{System.out.println("");
		System.out.println(empno);
		System.out.println(empname);
		System.out.println(designation);
		System.out.println(department);
		System.out.println(sal);
	}
    
    public static void main(String[] args) {
		
    	Emp e1 = new Emp();
    	
    	e1.readEmpData();
    	
    	e1.DisplayEmpData();
    	
    	
    
	}
    
    
    
}
