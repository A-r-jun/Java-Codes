
public class Employee 
{
//	int empno;
 //   String empname;
 //   int sal;	
   public void getSalary() 
   {
    //System.out.println("Employee Salary :"+sal); 
    System.out.println("Employee Salary");
   }
   
}

class Developer extends Employee
{
	 public void getSalary() 
	   {
	    System.out.println(" Developer Salary");
	   }
}

class Manager extends Employee
{
	 public void getSalary() 
	   {
	    System.out.println("Manager Salary");
	   }
	
}

class methodoverridingSalary
{
	public static void main(String[] args) 
	{
	
		Employee e= new Employee();
		Developer d =new Developer();
		Manager m= new Manager();
		
		e.getSalary();
		d.getSalary();
		m.getSalary();
		
		
	}
}

