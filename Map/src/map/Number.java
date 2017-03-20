package map;

public class Number
{
	private int theValue;
	
	public Number(int value)
	{
		theValue=value;
	}	
	
	public int getValue()
	{
		return theValue;
	}
	
	public boolean equals(Number obj)
	{
		return theValue==obj.getValue();
	} 
	
	public int hashCode()
	{
		return theValue%10;
	}

	public String toString()
	{
		return "" + theValue;
	}	
}