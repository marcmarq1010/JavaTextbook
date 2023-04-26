import java.util.Scanner;

public class PayrollTestClass 
{
	public static void main(String[] args)
	{
		// Create a new Payroll object
		Payroll employee = new Payroll();

		// Get user input for name, idNumber, hourly pay rate, and hours worked
		String name = getName();
		String idNumber = getIdNumber();
		double hourlyPayRate = getHourlyPayRate();
		int hoursWorked = getHoursWorked();
		
		// Set the employee's name, idNumber, hourly pay rate, and hours worked
		employee.setEmployeeName(name);
		employee.setIdNumber(idNumber);
		employee.setHourlyPayRate(hourlyPayRate);
		employee.setNumOfHoursWorked(hoursWorked);
		
		// Display the employee's information and gross pay
		displayEmployeeInfo(employee);
	}
	
	
	public static String getName()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		return input.nextLine();
	}
	
	public static String getIdNumber()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your ID number: ");
		return input.nextLine();
	}
	
	public static double getHourlyPayRate() 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the hourly pay rate: ");
		return input.nextDouble();
	}
	
	public static int getHoursWorked() 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of hours worked: ");
		return input.nextInt();
	}
	
	public static void displayEmployeeInfo(Payroll employee)
	{
		System.out.println("Employee name: " + employee.getEmployeeName());
		System.out.println("Employee ID: " + employee.getIdNumber());
		System.out.println("Gross pay: $" + employee.getGrossPay());
	}
}
