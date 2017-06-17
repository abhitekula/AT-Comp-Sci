package tree;

public class PhoneEntry implements Comparable{
	
	private String name;
	private Integer number;
	
	public PhoneEntry(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public PhoneEntry(String name) {
		this.name = name;
		this.number = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int hashcode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneEntry other = (PhoneEntry) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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

	@Override
	public String toString() {
		return "[Name=" + name + ", Number=" + number + "]";
	}
	
	

}
