package map;

import java.util.HashMap;
import java.util.Map;

public class TeamMap {
	
	//Name, Weight Group
	private Map<Wrestler, Integer> team;
	
	public TeamMap(){
		team = new HashMap<Wrestler,Integer>();
	}
	
	public void add(Wrestler obj){
		team.put(obj, obj.hashCode()%10);
	}

	public String get(Wrestler juan) {
		return "" + team.get(juan);
	}

	public void changeWeightGroup(Wrestler juan, int i) {
		team.put(juan, i);
	}
	
	public String toString(){
		return team.toString();
	}

}
