package map;

public class Wrestler
{
	private String name;
	private int weight;
	
    /**
     * Constructor for objects of class Wrestler
     */
    public Wrestler( String theName, int theWeight)
        
    {
        name= theName;
        weight=theWeight;
    }
    
    
    public int getWeight()
    {
        return weight;
    }
    
    public String getName()
    {
       
        return name;
    }
    public String toString()
    {
       
        return name + "  " +weight;
    }


	@Override
	public int hashCode() {
		int result = weight/10;
		result+=10;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		Wrestler wrestle = (Wrestler)obj;
		if(this.name.equals(wrestle.getName()) && this.weight==wrestle.getWeight())
			return true;
		return false;
	}
    
    
}
