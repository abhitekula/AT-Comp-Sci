package hashtable;


public class Number
{
	private int theValue;
	
	public Number(int value)
	{
		theValue = value;
	}	
	
	public int getValue()
	{
		return theValue;
	}
	
	public boolean equals(Object obj)
	{
		Number o = (Number)obj;
		return o.getValue() == this.getValue();
	} 
	
	public int hashCode()
	{
		return this.getValue() % 10;
	}

	public String toString()
	{
		return this.getValue() + "";
	}	
}