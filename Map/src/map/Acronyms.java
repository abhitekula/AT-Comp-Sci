package map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.IOException;

public class Acronyms{
	
	private Map<String,String> ac;

	public Acronyms(File f)throws IOException{
		ac = new TreeMap<String, String>();
		Scanner k = new Scanner(f);
		int x=Integer.parseInt(k.nextLine());
		
		for(int i=0;i < x;i++){
			putEntry(k.nextLine().trim());
		}
		k.close();
	}

	public void putEntry(String entry){
		String[]list = entry.split(" - ");
		ac.put(list[0], list[1]);
	}

	public String convert(String sent){
		Scanner chop = new Scanner(sent);
		String output ="";

		while(chop.hasNext()){
			String a=chop.next(),x="";
			if(a.endsWith(".")){
				x += a.charAt(a.length()-1)+" ";
				a=a.substring(0, a.length()-1);
			}
			if(!ac.containsKey(a)){
				output+=a+" ";
			}
			else{
				output+=ac.get(a)+" ";
			}
			output+=x;
		}
		chop.close();
		
		return output;
	}

	public String toString(){
		
		return "";
	}
}