class Rectangle extends Shape
{
	@Override
	public String draw()
	{
	return "This is Rectangle class";
	}
}
class Line extends Shape
{
	@Override
	public String draw()
	{
	return "This is Line class";	
	}
}
class Cube extends Shape
{
	@Override
	public String draw()
	{	
	return "This is Cube class";
	}
}
abstract class Shape
{
	abstract public String draw();
}
public class Assignment2Q5
{
	public static void main(String[] args)
	{	
		Shape s=new Rectangle();
		System.out.println(s.draw());

		s=new Line();
		System.out.println(s.draw());

		s=new Cube();
		System.out.println(s.draw());
	}
}



