package pqueue;

public class Swimmer implements Comparable<Swimmer>{
	//code for instance variable not shown
	   //code for methods not shown
		private double height;
		private double weight;
		private int age;
		
	   public Swimmer(){
		   height=0;
		   weight=0;
		   age=0;
	   }
	   
	   public Swimmer(double ht, double wt, int ag){
		   height=ht;
		   weight=wt;
		   age=ag;
	   }
	   
	   public void setWeight(int wt){
		   weight=wt;
	   }

	   public void setHeight( int ht) {
		   height=ht;
	   }
		
	   public void setAge( int ag) {
		   age=ag;
	   }
		
	   public Object clone(){
		   return new Swimmer(height,weight,age);
	   }

	   public double getWeight()  {
		   return weight;
	   }
		
	   public double getHeight() {
		   return height;
	   }
		             
	   public int getAge()  {
		   return age;
	   }

	   public boolean equals( Swimmer o ){
		   if(height==o.getHeight() && weight==o.getWeight() && age==o.getAge())
			   return true;
		   else
			   return false;
	   }
	    
	   public int compareTo( Swimmer rhs ){
		   if(height<rhs.getHeight())
			   return -1;
		   else if(height>rhs.getHeight())
			   return 1;
		   else if(weight<rhs.getWeight())
			   return -1;
		   else if(weight>rhs.getWeight())
			   return 1;
		   else if(age<rhs.getAge())
			   return -1;
		   else if(age>rhs.getAge())
			   return 1;
		   else
			   return 0;
		   
	   }
	       
	   public String toString( ) {
		   return "\nHeight: " + height + "\nWeight: " + weight + "\nAge: " + age;
	   }


}
