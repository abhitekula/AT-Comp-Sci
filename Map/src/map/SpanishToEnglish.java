package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanishToEnglish
{
	private Map<String,String> pairs;
	private String temp;

	public SpanishToEnglish()
	{
		pairs = new HashMap<String,String>();
		temp="";
	}

	public void putEntry(String entry)
	{
		//System.out.println(entry);
		String[] list = entry.split(" ");
		pairs.put(list[0], list[1]);
	}

	public String translate(String sent)
	{
		Scanner chop = new Scanner(sent);
		String output ="";
		while(chop.hasNext()){
			temp=chop.next();
			if(pairs.containsKey(temp))
					output+=pairs.get(temp) + " ";
			else
				output+=temp = " ";
		}
		return output;
	}

	public String toString()
	{
		return pairs.toString().replaceAll("\\,","\n");
	}
}