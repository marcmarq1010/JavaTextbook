import java.util.Scanner;

public class TemperatureTestClass 
{
	public static void main(String[] args)
	{
		Temperature temperature = createClass();
		double fahrenheit = getTemp();
		temperature.setfTemp(fahrenheit);
		display(temperature);
	}
	
	public static Temperature createClass()
	{
		return new Temperature();
	}
	
	public static double getTemp()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in fahrenheit: ");
		return input.nextDouble();
	}
	
	public static void display(Temperature temperature)
	{
		System.out.println("The temperature in Fahrenheit is: " + temperature.getfTemp());
		System.out.println("The temperature in Celcius is: " + temperature.getCelcius());
		System.out.println("The temperature in Kelvin is: " + temperature.getKelvin());
	}
}
