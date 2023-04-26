
public class EmployeeClassTest 
{
	public static void main(String[] args)
	{
		
		Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
		Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
		DisplayHeader();
		DisplayEmployees(emp1, emp2, emp3);
	}
	
	private static void DisplayHeader() 
	{
		System.out.println("Name\t\tIDNumber\tDepartment\tPosition");	
	}
	
	
	private static void DisplayEmployees(Employee emp1, Employee emp2, Employee emp3)
	{
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}
}