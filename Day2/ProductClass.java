
public class ProductClass 
{
     int pid;
     String pname;
     float price;
     char pcode;
     float dis;
    
    
	public void printProduct()
	{
		System.out.println(pid);
		System.out.println(pname);
		System.out.println(price);
		System.out.println(pcode);
		System.out.println(dis);
	}
	
	public void findDiscount()
	{
		
		dis = price * 0.5f;
		
		
	}
    
	
	public static void main(String[] args) 
	{
		//reference variable
		
		
		ProductClass p1 = new ProductClass();
		
		
		p1.pid = 1001;
		p1.pname = "dell";
		p1.price = 4000;
		p1.pcode = 'A';
		
		
		p1.findDiscount();
		p1.printProduct();
		
		ProductClass p2 = new ProductClass();
		
		
		
		p2.pid = 1002;
		p2.pname = "keyboard";
		p2.price = 300;
		p2.pcode ='B';
		p2.findDiscount();
		p2.printProduct();
		
		ProductClass p3 = new ProductClass();
		p3.pid = 1003;
		p3.pname = "mouse";
		p3.price = 400;
		p3.pcode ='C';
		p3.findDiscount();
		p3.printProduct();
	}
	
}



