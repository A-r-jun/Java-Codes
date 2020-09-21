import java.util.*;
public class Player 
{
		String name ;
		int run ;
		int wicket; 
		int matches ;
		String country; 
		int noofcentury; 
		String Category = " "; 
	
	public Player(String name, int run, int wicket, int matches, String country, int noofcentury) {
		this.name =name;
		this.run =run;
		this.wicket=wicket;
		this.matches =matches;
		this.country=country;
		this.noofcentury=noofcentury;
		this.Category="Uncategorized";
	}

	
	public String toString() 
	{
		
		return "Player [Name=" + name + ", Run=" + run + ", Wicket=" + wicket
				+ ", Matches=" + matches + ", Country=" + country
				+ ", No of Century=" + noofcentury + ", Category=" + Category
				+ "]";
	}
	
	public static void Maxrun(ArrayList<Player> al)
	{
		System.out.println("Player with Max run is :");
		Player maxrun =al.get(1);
		for (Player obj : al) 
		{	
			if(maxrun.run<obj.run)
				maxrun = obj;

		}
		System.out.println(maxrun.toString());
		System.out.println();
	}
	public static void Printlist(ArrayList<Player> al)
	{	System.out.println("Player List :");
		for (Player obj : al) 
		System.out.println(obj.toString());
		
	}
	
	public static void updatecategory(ArrayList<Player> al){
		
		for (Player obj : al) 
			if(obj.noofcentury>=10)
				obj.Category="A";
	}

	
	
	public static void main(String[] args) 
{		int pos=0;
		
		Player p1= new Player("A", 1374, 4, 14, "India", 3);
		Player p2= new Player("B", 1821, 7, 19, "India", 11);
		Player p3= new Player("C", 692, 3, 7, "India", 2);
		Player p4= new Player("D", 74, 16, 2, "India", 0);
		Player p5= new Player("E", 420, 1, 6, "India", 1);
		
	
		ArrayList<Player> al=new ArrayList<>();
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);

		
		
		Maxrun(al);
		updatecategory(al);
		Printlist(al);
		
		
			for (Player obj : al) 
				if(obj.run<100 && obj.matches <3)
					pos= al.indexOf(obj);
			
			al.remove(pos);

			Printlist(al);
			
		


		
}		
}
