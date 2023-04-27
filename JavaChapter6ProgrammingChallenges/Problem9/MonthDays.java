
public class MonthDays
{
	private int month;
	private int year;
	
	public MonthDays(int month, int year)
	{
		this.month = month;
		this.year = year;
	}
	
	public MonthDays() 
	{
		
	}

	public int getMonth() 
	{
		return month;
	}

	public void setMonth(int month) 
	{
		this.month = month;
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public int getNumberOfDays()
	{
		int days = 0;
		
		switch(month)
		{
		case 1:
			days = 31;
			break;
		case 2:
			boolean isLeapYear = getLeapYearStatus(year);
			days = isLeapYear? 29 : 28;
			break;
		case 3:
			days = 31;
			break;
		case 4:
			days = 30;
			break;
		case 5:
			days = 31;
			break;
		case 6:
			days = 30;
			break;
		case 7:
			days = 31;
			break;
		case 8:
			days = 31;
			break;
		case 9:
			days = 30;
			break;
		case 10:
			days = 31;
			break;
		case 11:
			days = 30;
			break;
		case 12:
			days = 31;
			break;
		default:
			days = 0;
			break;
		}
		

		return days;
	}
	
	public boolean getLeapYearStatus(int year)
	{
		boolean isLeapYear = false;
		
		boolean leapYearStep1 = year % 100 == 0? true : false;
		boolean leapYearStep2 = year % 400 == 0? true : false;
		boolean leapYearStep3 = year % 4 == 0? true : false;
		
		if(leapYearStep1 && leapYearStep2)
		{
			isLeapYear = true;
		}
		else if(!leapYearStep1 && leapYearStep3)
		{
			isLeapYear = true;
		}
		
		return isLeapYear;
	}
}
