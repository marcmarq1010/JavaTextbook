import java.util.Scanner;

public class CircleTestClass
{
	public static void main(String[] args) 
	{
		Circle circle = createMyClass();
		double radius = getRadius();
		circle.setRadius(radius);
		display(circle);
	}
	
	public static Circle createMyClass()
	{
		return new Circle();
	}
	
	public static double getRadius()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		return input.nextDouble();
	}
	
	public static void display(Circle circle)
	{
		System.out.println("The area is: " + circle.getArea());
		System.out.println("The diameter is: " + circle.getDiameter());
		System.out.println("The circumference is: " + circle.getCircumference());
	}
}
