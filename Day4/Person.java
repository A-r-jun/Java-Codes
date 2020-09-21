
public class Person 
{
	String name;
	int age;
	
	public Person(String name,int age) 
	{
		this.name=name;
		this.age=age;
	}
	
}

class Teacher extends Person
{
	 static String Profession="Teacher";
	public Teacher(String name, int age) {
		super(name, age);
		
	}
	
	public void Myprofession()
	{ 	System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("I'm a "+Profession);
	}
}

class Employee extends Person
{
	static String Profession="Employee";
	public Employee(String name, int age) {
		super(name, age);
		
	}
	
	public void Myprofession()
	{System.out.println("Name :"+name);
	System.out.println("Age :"+age);
	System.out.println("I'm an "+Profession);
	}
}

class PermanentEmployee extends Employee
{
	static String Profession=" Permanent Employee";
	
	public PermanentEmployee(String name, int age) {
		super(name, age);
	}

	public void Myprofession()
	{System.out.println("Name :"+name);
	System.out.println("Age :"+age);
	System.out.println("I'm a "+Profession);
	}
}
class ContractEmployee extends Employee
{
	static String Profession=" Contract Employee";
	
	public ContractEmployee(String name, int age) {
		super(name, age);
	}

	public void Myprofession()
	{System.out.println("Name :"+name);
	System.out.println("Age :"+age);
	System.out.println("I'm a "+Profession);
	}
}

class test
{
	
	public static void main(String[] args) 
	{
		Teacher t= new Teacher("T", 24);
		Employee e =new Employee("E",25);
		PermanentEmployee p =new PermanentEmployee("P",31);
		ContractEmployee c=new ContractEmployee("C",30);
		
		t.Myprofession();
		e.Myprofession();
		p.Myprofession();
		c.Myprofession();
		
		
		
		
		
	}
}


