import java.util.Scanner;

public class MonthDaysTestClass
{
	public static void main(String[] args)
	{
		MonthDays date = createClass();
		setYear(date);
		setMonth(date);
		display(date);
	}
	
	public static MonthDays createClass() 
	{
		return new MonthDays();
	}
	
	public static void setYear(MonthDays date)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year: ");
		date.setYear(input.nextInt()); 
	}
	
	public static void setMonth(MonthDays date)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month (1-12): ");
		date.setMonth(input.nextInt()); 
	}
	
	public static void display(MonthDays date)
	{
		System.out.println(date.getNumberOfDays() + " days");
	}
}
