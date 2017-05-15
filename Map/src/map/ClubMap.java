package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ClubMap {
	
	private HashMap<String,TreeSet<Student>> clubMap;

	public ClubMap(){
		clubMap = new HashMap<String,TreeSet<Student>>();
	}
	
	public ClubMap(HashMap<String,TreeSet<Student>> clubMap) {
		this.clubMap = clubMap;
	}

	public HashMap<String,TreeSet<Student>> getClubMap() {
		return clubMap;
	}

	public void setClubMap(HashMap<String,TreeSet<Student>> clubMap) {
		this.clubMap = clubMap;
	}
	
	public void addStudent(String clubname, Student student){
		if(!clubMap.containsKey(clubname)){
			TreeSet<Student> temp = new TreeSet<Student>();
			temp.add(student);
			clubMap.put(clubname, temp);
		}
		else{
			TreeSet<Student> temp = clubMap.get(clubname);
			temp.add(student);
			clubMap.put(clubname, temp);
		}
	}
	
	public String toString(){
		return clubMap.toString();
	}
	
	public void display(){
		Set<String> keys = clubMap.keySet();
		for(String a : keys){
			System.out.println(a + ": " + clubMap.get(a).toString());
		}
	}
	
	public void clubRoster(String clubName){
		System.out.println(clubMap.get(clubName).toString());
	}
	

}
