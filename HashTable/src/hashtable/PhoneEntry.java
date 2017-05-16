package hashtable;

public class PhoneEntry implements Comparable{
	
	private String name;
	private Integer number;
	
	public PhoneEntry(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public int hashcode(){
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public int compareTo(Object arg0) {
		PhoneEntry temp;
		if(arg0 instanceof PhoneEntry)
			temp = (PhoneEntry)arg0;
		else
			return -1;
		if(name.equals(temp.getName()) && number==temp.getNumber())
			return 0;
		if(name.compareTo(temp.getName())<0)
			return -1;
		if(name.compareTo(temp.getName())>0)
			return 1;
		if(number>temp.getNumber())
			return 1;
		else
			return -1;
	}

}
