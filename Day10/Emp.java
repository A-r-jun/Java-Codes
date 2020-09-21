import java.io.Serializable;
import java.util.Scanner;


public class Emp implements Serializable

{
		int empno;
        String empname;
        String designation	;
        String department;
        int sal;	
    public Emp(int empno, String empname, int sal) {
		this.empno =empno;
		this.empname = empname;
		this.sal =sal;
	}
    public void readEmpData()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Details :");
		empno= s.nextInt();
		empname = s.next();
		designation = s.next();
		department = s.next();
		sal =s.nextInt();
		s.close();
    	
	}
    
    public void DisplayEmpData()
	{System.out.println("");
		System.out.println("Employee Id :"+empno);
		System.out.println("Employee Name :"+empname);
		System.out.println("Employee Designation :"+designation);
		System.out.println("Employee Department :"+department);
		System.out.println("Employee Salary :"+sal);
	}
    
    public static void main(String[] args) {
		
    //	Emp e1 = new Emp();
    	
    //	e1.readEmpData();
    	
    //	e1.DisplayEmpData();
    	
    	
    
	}
    
    
    
}
