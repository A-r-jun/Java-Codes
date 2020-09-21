public class Person 
{
	String name;
	int age;
	char gender;
	
	public Person(String name,int age, char gender) 
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}

	public String toString() {
		return "Person [Name=" + name + ", Age=" + age + ", Gender=" + gender
				+ "]";
	}
	
}

class Student extends Person
{	int sid;
	String coursename;
	String clgname;
	
	public Student(String name, int age, char gender,int sid,String coursename,String clgname) {
		super(name, age, gender);
		this.sid=sid;
		this.coursename= coursename;
		this.clgname=clgname;

	}
	
	public void findgrade()
	{ 	System.out.println("Grade");
		
		
	}
}

//class Employee extends Person
//{
//	
//	public Employee(String name, int age, char gender) {
//		super(name, age, gender);
//		
//	}
//	
//	
//	}
//}

class ITstudent extends Student
{

	public ITstudent(String name, int age, char gender, int sid,
			String coursename, String clgname) {
		super(name, age, gender, sid, coursename, clgname);
		
	}
	
}

class Mathstudent extends Student
{

	public Mathstudent(String name, int age, char gender, int sid,
			String coursename, String clgname) {
		super(name, age, gender, sid, coursename, clgname);
		
	}
	
}
