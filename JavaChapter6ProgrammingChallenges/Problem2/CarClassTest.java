
public class CarClassTest 
{
	public static void main(String[] args)
	{
		Car Mustang = new Car(1967, "Mustang");
		
		
		System.out.println("Accelerating");
		
		for(int i = 0; i < 5; ++i) 
		{
			Mustang.Accelerate();
			
			System.out.print("Current Speed: ");
			System.out.print(Mustang.getSpeed());
			System.out.println(" MPH");
		}
		
		System.out.println("\nBraking");
		
		for(int i = 0; i < 5; ++i)
		{
			Mustang.Brake();
			
			System.out.print("Current Speed: ");
			System.out.print(Mustang.getSpeed());
			System.out.println(" MPH");
		}
	}
}
