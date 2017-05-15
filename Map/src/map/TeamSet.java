package map;

import java.util.HashSet;
import java.util.Set;

public class TeamSet {
	
	Set<Wrestler> team;
	
	public TeamSet(){
		team = new HashSet<Wrestler>();
	}
	
	public void add(Wrestler wrestle){
		team.add(wrestle);
	}
	
	public double avgWeight(){
		double sum=0;
		for(Wrestler a: team){
			sum+=a.getWeight();
		}
		return sum/team.size();
	}
	
	public HashSet<Wrestler> lightweights(){
		HashSet<Wrestler> lightweights = new HashSet<Wrestler>();
		for(Wrestler a: team){
			if(a.getWeight()<120)
				lightweights.add(a);
		}
		return lightweights;
		
	}
}
