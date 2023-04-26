
public class Employee 
{
	private String name; //holds the employee’s name
	private int idNumber; //holds the employee’s ID number
	private String department; //holds the name of the department where the employee works
	private String position; //holds the employee’s job title
	
	public Employee(String name, int idNumber, String department, String position)
	{
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}
	
	public Employee(String name, int idNumber) //employee’s name and ID number. The department and position fields should be assigned an empty string ("").
	{
		this.name = name;
		this.idNumber = idNumber;
		this.department = "";
		this.position = "";
	}
	
	public Employee()
	{
		this.name = "";
		this.idNumber = 0;
		this.department = "";
		this.position = "";
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getIdNumber() 
	{
		return idNumber;
	}

	public void setIdNumber(int idNumber) 
	{
		this.idNumber = idNumber;
	}

	public String getDepartment()
	{
		return department;
	}

	public void setDepartment(String department) 
	{
		this.department = department;
	}

	public String getPosition() 
	{
		return position;
	}

	public void setPosition(String position) 
	{
		this.position = position;
	}
	

	@Override
	public String toString() 
	{
		return  name +"\t"+ idNumber +"\t\t"+ department +"\t"+ position;
	}
}
