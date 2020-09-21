import java.util.*;

public class Book
{	
	String name;
	float price;
	String authorname;
	int isbnno;
	String publication;
	
	public Book(String name,float price,String authorname,int isbnno,String publication) 
	{
		this.name=name;
		this.price=price;
		this.authorname=authorname;
		this.isbnno=isbnno;
		this.publication=publication;
	}

	public String toString() 
	{
		return "Book [Name=" + name + ", Price=" + price + ", Authorname="
				+ authorname + ", Isbnno=" + isbnno + ", Publication="
				+ publication + "]";
	}

	public static void main(String[] args) 
{
    HashMap<Integer,Book> hm =new HashMap<>();
		
    
    Book b1 =new Book("To Kill a MOckingbird", 275, "Harper Lee", 10786 , "Grand Central Publishing");
    Book b2 =new Book("A Brief History Of Time", 325, "Stephen Hawking", 75211, "Bantam ");
    Book b3= new Book("The Hitchhiker's Guide to the Galaxy", 424, "Douglas Adams", 8311 , "Pan");
    Book b4 =new Book("The Time Machine", 125 , "H. G. Wells" , 92956 ,"Fingerprint! Publishing");
    Book b5 = new Book("The Adventures of Sherlock Holmes ", 180 , "Sir Conan Doyle", 93860, "Fingerprint! Publishing");
    
    hm.put(1, b1);
	hm.put(2, b2);
	hm.put(3, b3);
	hm.put(4, b4);
	hm.put(5, b5);
    
	 for(Map.Entry  m :hm.entrySet())
	    {
			System.out.println("Book Id = " +m.getKey());
		    Book b	=(Book) m.getValue();	    
		   System.out.println(b.toString());
		    
		 }
	    
	
	Scanner s = new Scanner(System.in);
	System.out.println("enter the key values");
    int key = s.nextInt();
    
    Book b=hm.get(key);

	System.out.println(b.toString());
	System.out.println("You will Get 10% discount on this book if you get it now ");
	b.price -= (b.price/10); 
	System.out.println(b.toString());
	
	s.close();
		
}




	
	
}
