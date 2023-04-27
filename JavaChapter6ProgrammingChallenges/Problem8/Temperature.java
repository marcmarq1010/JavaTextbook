
public class Temperature 
{
	private double fTemp;
	
	public Temperature(double fahrenheit)
	{
		fTemp = fahrenheit;
	}
	
	public Temperature()
	{
		
	}

	public double getfTemp() 
	{
		return fTemp;
	}

	public void setfTemp(double fTemp) 
	{
		this.fTemp = fTemp;
	}
	
	public double getCelcius()
	{
		return ((5) * (fTemp - 32)) / 9;
	}
	
	public double getKelvin()
	{
		return (((5) * (fTemp - 32)) / 9) + 273;
	}
}
