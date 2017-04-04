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
	
	public String stars(int n){
		if (n==1){
			return "*";
		}
		return "*"+stars(n-1);
	}

	public String toString(){
		String output="";
		String allStars="";
		Set<Entry<String, Integer>> bob = histogram.entrySet();
		
		for(Entry<String, Integer> x : bob){
			allStars=stars(x.getValue());
			output+=x.getKey()+"\t"+allStars+"\n";
			allStars="";
		}
		return output+"\n\n";
	}
}