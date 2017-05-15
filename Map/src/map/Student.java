package map;

public class Student implements Comparable<Student>{
	
	private String fname;
	private String lname;
	private int id;
	
	public Student(String fname, String lname, int id){
		this.fname = fname;
		this.lname=lname;
		this.id=id;
	}


	public Student() {
		
	}


	public String getFName() {
		return fname;
	}


	public void setFName(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String toString(){
		return fname + " " + lname;
	}


	@Override
	public int compareTo(Student a) {
		if(this.lname.compareTo(a.lname)<0)
			return -1;
		else if(this.lname.compareTo(a.lname)>0)
			return 1;
		else{
			if(this.fname.compareTo(a.fname)<0)
				return -1;
			else if(this.fname.compareTo(a.fname)>0)
				return 1;
			else{
				if(this.id<a.id)
					return -1;
				else if(this.id>a.id)
					return 1;
				else
					return 0;
			}
		}
	}

}
