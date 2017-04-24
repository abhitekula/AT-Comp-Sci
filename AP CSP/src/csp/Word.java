package csp;

public class Word {
	
	private String name;
	private int number;
	
	public Word(String word){
		name = word;
		number = 1;
	}
	
	public Word(String word, int num){
		name = word;
		number = num;
	}
	
	public void count(){
		number++;
	}
	
	public String getWord(){
		return name;
	}
	
	public int getNumber(){
		return number;
	}
}
