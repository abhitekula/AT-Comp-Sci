package map;

import java.util.Map;
import java.io.File;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.io.IOException;

public class Relatives{
	
	private Map<String,Set<String>> map;

	public Relatives(File f)throws IOException{
		map = new TreeMap<String,Set<String>>();
		Scanner k = new Scanner(f);
		int x=Integer.parseInt(k.nextLine());
		
		for(int i=0;i < x;i++){
			setPersonRelative(k.nextLine().trim());
		}
		k.close();
	}

	public void setPersonRelative(String line){
		String[] personRelative = line.split(" ");
		Set<String> r = new TreeSet<String>();
		if(!map.containsKey(personRelative[0])){
			r.add(personRelative[1]);
			map.put(personRelative[0], r);
		}
		else{
			map.get(personRelative[0]).add(personRelative[1]);
			map.put(personRelative[0],map.get(personRelative[0]));
		}
	}

	public String getRelatives(String person){
		String output="";
		
		for(String s: map.get(person)){
			output+=s+" ";
		}
		
		return output;
	}

	public String toString(){
		String output="";
		Set<Entry<String,Set<String>>> bob = map.entrySet();
		
		for(Entry<String,Set<String>> x : bob){
			output+=x.getKey()+" is related to "+getRelatives(x.getKey())+"\n";
		}
		
		return output;
	}
}