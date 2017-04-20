package map;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;


public class Histogram{
	
	private Map<String,Integer> histogram;

	public Histogram(){
		histogram= new TreeMap<String,Integer>();
	}

	public Histogram(String sent){
		histogram= new TreeMap<String,Integer>();
		setSentence(sent);
	}
	
	public void setSentence(String sent){
		for (char z : sent.toCharArray()){
			if (!histogram.containsKey(z+"")){
				histogram.put(z+"", 1);
			}
			else{
				histogram.put(z+"", histogram.get(z+"")+1);
			}
		}
	}
	
	public String multiply(int n){
		String temp="";
		for(int x=1;x<=n;x++){
			temp+="*";
		}
		return temp;
	}

	public String toString(){
		String output="";
		String Stars="";
		Set<Entry<String, Integer>> set = histogram.entrySet();
		
		for(Entry<String, Integer> x : set){
			Stars=multiply(x.getValue());
			output+=x.getKey()+"\t"+Stars+"\n";
			Stars="";
		}
		return output+"\n\n";
	}
}