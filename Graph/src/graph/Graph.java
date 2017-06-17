package graph;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Graph
{
	private TreeMap<String, String> map;
	private boolean yahOrNay;

	public Graph(String line)
	{
		map = new TreeMap<String, String>();
		Scanner in = new Scanner(line);
		String temp = "";
		String key = "";
		while(in.hasNext()){
			temp = in.next();
			key="" + temp.charAt(0);
			if(map.containsKey(key))
				map.put(key, map.get(key).concat("" + temp.charAt(1)));
			else
				map.put(key, "" + temp.charAt(1));
			key = "" + temp.charAt(1);
			if(map.containsKey(key))
				map.put(key, map.get(key).concat("" + temp.charAt(0)));
			else
				map.put(key, "" + temp.charAt(0));
		}
		System.out.println(map);
	}

	public boolean contains(String letter)
	{
	   return true;
	}
	
	public void check(String edge) {
		check("" + edge.charAt(0), "" + edge.charAt(1), "");
	}
	
	public void check(String first, String second, String placesUsed)
	{
		
	}

	public String toString()
	{
		return "";
	}

}