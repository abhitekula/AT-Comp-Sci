package map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives
{
	private Map<String,Set<String>> map;

	public Relatives()
	{
		map = new TreeMap<String,Set<String>>();
	}

	public void setPersonRelative(String line)
	{
		Set<String> temp = new TreeSet<String>();
		String[] personRelative = line.split(" ");
		//System.out.println(personRelative[0]);
		//System.out.println(personRelative[1]);
		if(map.containsKey(personRelative[0])){
				temp=map.get(personRelative[0]);
				temp.add(personRelative[1]);
				//System.out.println(temp);
				map.replace(personRelative[0], temp);
		}
		else{
			map.put(personRelative[0], new TreeSet<String>());
			map.get(personRelative[0]).add(personRelative[1]);
		}
		if(map.containsKey(personRelative[1])){
			temp=map.get(personRelative[1]);
			//System.out.println(temp);
			temp.add(personRelative[0]);
			//System.out.println(temp);
			map.replace(personRelative[1], temp);
		}
		else{
			map.put(personRelative[0], new TreeSet<String>());
			map.get(personRelative[0]).add(personRelative[1]);
		}
	}

	public String getRelatives(String person)
	{
		return map.get(person).toString();
	}

	public String toString()
	{
		String output="";
		Set<String> keys = map.keySet();
		for(String key : keys){
			//System.out.println(map.get(key));
			output+="\n" + key + " is related to " + map.get(key);
		}
		return output;
		//System.out.println(map);
	}
	
}