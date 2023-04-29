import java.util.Scanner;

public class FreezingAndBoilingPointsTestClass 
{
	public static void main(String[] args)
	{
		boolean TempResults;
		
		FreezingAndBoilingPoints temp = createClass();
		setTemp(temp);
		display(temp);
	}
	
	public static FreezingAndBoilingPoints createClass()
	{
		return new FreezingAndBoilingPoints();
	}
	
	public static void setTemp(FreezingAndBoilingPoints temp)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temperatire in farhenheit: ");
		temp.setTemp(input.nextDouble());
	}
	
	public static void display(FreezingAndBoilingPoints temp)
	{
		String messageOF = temp.isOxygenFreezing()?"Oxygen\n":"";
		String messageOB = temp.isOxygenBoiling()?"Oxygen\n":"";
		String messageEF = temp.isEthylFreezing()?"Ethyl\n":"";
		String messageEB = temp.isEthylBoiling()?"Ethyl\n":"";
		String messageWF = temp.isWaterFreezing()?"Water\n":"";
		String messageWB = temp.isWaterBoiling()?"Water\n":"";
		
		System.out.println("List of substance that will freeze in " + temp.getTemp() + " degrees farhenheit: \n");
		System.out.print(messageOF);
		System.out.print(messageWF);
		System.out.println(messageEF);
		
		System.out.println("List of substance that will boil in " + temp.getTemp() + " degrees farhenheit: \n");
		System.out.print(messageOB);
		System.out.print(messageWB);
		System.out.println(messageEB);
	}
}
