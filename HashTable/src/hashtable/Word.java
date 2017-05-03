package hashtable;

public class Word
{
	private String theValue;
	
	public Word(String value)
	{
		theValue = value;
	}	
	
	public String getValue()
	{
		return theValue;
	}
	
	public boolean equals(Object obj)
	{
		Word o = (Word)obj;
		return o.getValue().equals(this.getValue());
	} 
	
	public int hashCode()
	{
		return (numVowels() * theValue.length()) % 10;
	}
	
	private int numVowels(){
		theValue.toLowerCase();
		int count=0;
		for(char a: theValue.toCharArray()){
			if( a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
				count++;
		}
		return count;
	}

	public String toString()
	{
		return this.getValue();
	}	
	
}