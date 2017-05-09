package map;

import java.util.HashMap;
import java.util.Map;

public class TeamMap {
	
	private Map<Wrestler, Integer> team;
	
	public TeamMap(){
		team = new HashMap<Wrestler,Integer>();
	}
	
	public void add(Wrestler obj){
		team.put(obj, obj.hashCode()%10);
	}

	public String get(Wrestler juan) {
		// TODO Auto-generated method stub
		return null;
	}

	public void changeWeightGroup(Wrestler juan, int i) {
		// TODO Auto-generated method stub
		
	}

}
