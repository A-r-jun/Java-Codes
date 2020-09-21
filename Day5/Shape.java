
public class Shape
{
 public void draw()
 {
	 System.out.println("I am a Shape");
 }
}

class Square extends Shape
{
	public void  draw() 
	{
		System.out.println("I am a Square");		
	}
}

class Circle extends Shape
{
	public void  draw() 
	{
		System.out.println("I am a Circle");		
	}
}
class Hexagon extends Shape
{
	public void  draw() 
	{
		System.out.println("I am a Hexagon");		
	}
}

class methodoverriding
{
	public static void main(String[] args) 
	{
		Shape sh =new Shape();
		Square sq= new Square();
		Circle c= new Circle();
		Hexagon h=new Hexagon();
		
		sh.draw();
		sq.draw();
		c.draw();
		h.draw();
		
		
		
		
	}
	
	
}