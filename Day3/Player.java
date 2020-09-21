import java.util.Scanner;


public class Player 
{
	String name;
	int age;
	String country;
	int run;
	
	public Player(String name, int age, String country, int run) {
		
		this.name= name;
		this.age= age;
		this.country=country;
		this.run=run;
	
	}
	
	
	
	public void display(){
		
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Country : "+country);
		System.out.println("Run : "+run);
	}
	
	
	public static void main(String[] args) 
{
//		Player p1= new Player("A", 23, "India", 3243);
//		Player p2= new Player("B", 21, "India", 4531);
//		Player p3= new Player("C", 27, "India", 5687);
//		Player p4= new Player("D", 26, "India", 5932);

		
//		p1.display();
//		p2.display();
//		p3.display();
//		p4.display();
		Player[] p=new Player[4];
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter Players details: ");
		for (int i =0; i <4; i++) 
		{
			String name;
			int age;
			String country;
			int run;
			
			name= s.next();
		  age=s.nextInt();
		  country= s.next();
		  run=s.nextInt();
		  
		  p[i]= new Player(name, age, country, run);
		}
		
		System.out.println("Player who scored above 5000 are :");
		for (int i =0; i <4; i++) 
		{
			if(p[i].run>=5000)
			p[i].display();	
		}

s.close();
}
	
	
}
