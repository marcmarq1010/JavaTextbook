
public class Payroll 
{
	private String employeeName;
	private String idNumber;
	private double hourlyPayRate;
	private int numOfHoursWorked;
	
	public Payroll(String employeeName, String idNumber, double hourlyPayRate, int numOfHoursWorked)
	{
		this.employeeName = employeeName;
		this.idNumber = idNumber;
		this.hourlyPayRate = hourlyPayRate;
		this.numOfHoursWorked = numOfHoursWorked;
	}
	
	public Payroll() 
	{
		
	}

	public double getGrossPay()
	{
		return numOfHoursWorked * hourlyPayRate;
	}
	
	public String getEmployeeName() 
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}

	public String getIdNumber()
	{
		return idNumber;
	}

	public void setIdNumber(String idNumber) 
	{
		this.idNumber = idNumber;
	}

	public double getHourlyPayRate() 
	{
		return hourlyPayRate;
	}

	public void setHourlyPayRate(double hourlyPayRate) 
	{
		this.hourlyPayRate = hourlyPayRate;
	}

	public int getNumOfHoursWorked() 
	{
		return numOfHoursWorked;
	}

	public void setNumOfHoursWorked(int numOfHoursWorked) 
	{
		this.numOfHoursWorked = numOfHoursWorked;
	}
	
	
}
