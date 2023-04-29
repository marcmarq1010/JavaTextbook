
public class FreezingAndBoilingPoints 
{
	private double temp;
	private boolean ethylFreezingPoint;
	private boolean ethylBoilingPoint;
	private boolean oxygenlFreezingPoint;
	private boolean oxygenlBoilingPoint;
	private boolean waterlFreezingPoint;
	private boolean waterBoilingPoint;
	
	public FreezingAndBoilingPoints(double temp)
	{
		this.temp = temp;
	}
	
	public FreezingAndBoilingPoints()
	{
		
	}

	public double getTemp() 
	{
		return temp;
	}
	
	public void setTemp(double temp)
	{
		this.temp = temp;
	}

	public boolean isEthylFreezing() 
	{
		return ethylFreezingPoint = temp <= -173?true:false;
	}

	public boolean isEthylBoiling() 
	{
		//172
		return ethylBoilingPoint = temp >= 172?true:false;
	}

	public boolean isOxygenFreezing() 
	{
		//-362
		return oxygenlFreezingPoint = temp <=-362?true:false;
	}

	public boolean isOxygenBoiling() 
	{
		//-306
		return oxygenlBoilingPoint = temp >= -306?true:false;
	}

	public boolean isWaterFreezing()
	{
		//32
		return waterlFreezingPoint = temp <= 32?true:false;
	}

	public boolean isWaterBoiling() 
	{
		//212
		return waterBoilingPoint = temp >= 212?true:false;
	}
}