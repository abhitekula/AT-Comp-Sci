/**
 * 
 */
package csp;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Abhinav Tekulapally
 * @date 4/9/17
 */
public class WordAmounts {

	private static Scanner keyboard;
	private static String filename;
	private static Scanner input; 
	private static String phrase;
	private static Scanner temp;
	private static String word;
	//List of top 10 Most Occurring Words in English Language
	private static final String[] top10 = {"the","be","to","of","and","a","in","that","have","i"};
	
	public static void main(String[] args) {
		keyboard =  new Scanner(System.in);
		System.out.println("Enter the filename of text document:");
		filename = keyboard.nextLine();
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Word> wordnumbers = new ArrayList<Word>();
		Word tempword = new Word("temporary");
		wordnumbers.add(tempword);
		String a ="",b="",c="",d="",e="";
		try{
			//Algorithm to find number of occurrences of each word, sort by number of occurrences,
			//and compare to top 10 most occurring words in English Language
			
			File file = new File(filename);
			input = new Scanner(file);
			
			//Algorithm to remove spaces, and punctuation
			while(input.hasNextLine()){
				phrase = input.nextLine();
				phrase = phrase.toLowerCase();
				a=phrase.replaceAll(",", "");
				b=a.replace('.', ' ');
				c=b.replaceAll("\'", "");
				d=c.replaceAll("\'s", "");
				e=d.replaceAll("!", "");
					
				//System.out.println(e);
				
				//Adds all words to an ArrayList
				temp = new Scanner(e);
				while(temp.hasNext()){
					word=temp.next();
					if(!(word.charAt(0)==45))
						words.add(word);
				}
					
			}
			
			//Sorts all words in Words ArrayList into Words objects with the word and its number of occurrences
			String temp;
			boolean bool=false;
			for(int x=0;x<words.size();x++){
				temp=words.get(x);
				for(int y=0;y<wordnumbers.size();y++){
					if(wordnumbers.get(y).getWord().equals(temp)){
						wordnumbers.get(y).count();
						bool=false;
						break;
					}
					if(!bool){
						wordnumbers.add(new Word(temp));
						bool=true;
					}
				}
			}
			wordnumbers.remove(0);
			
			//Sort by number of occurrences from greatest to least
			wordnumbers=sort(wordnumbers);
			words.remove(words.size()-1);
			
			//Print results
			System.out.println("Top 30 Most Occuring Words in Document:");
			if(wordnumbers.size()>=30){
			for(int z=0;z<30;z++){
				System.out.println("" + (z+1) + ") " + wordnumbers.get(z).getWord() + "\t" + (wordnumbers.get(z).getNumber()-1));
			}
			}
			else{
				for(int z=0;z<wordnumbers.size();z++){
					System.out.println("" + (z+1) + ") " + wordnumbers.get(z).getWord() + "\t" + (wordnumbers.get(z).getNumber()-1));
				}
			}
			System.out.println("\n\nTotal Number of Words:"+(words.size()));
			System.out.println("Number of Unique Words:"+(count(wordnumbers)));
			
			System.out.println("\n\nTop 10 Words in English Language");
			for(String top : top10){
				System.out.println(top);
			}
			
			int numInTop10=0;
			if(wordnumbers.size()>=10){
			System.out.println("\n\nWords found in Top 10 words in English Language and top 10 Words in input document:");
				for(int z=0;z<10;z++){
					if(inTop10(wordnumbers.get(z).getWord())){
						System.out.println(wordnumbers.get(z).getWord());
						numInTop10++;
					}
				}
			System.out.println("\nNumber of Words in Document Top 10 and English Language Top 10:");
			System.out.println(numInTop10);
			}

			
		} catch(FileNotFoundException f){
			System.out.println("File not Found");
			f.printStackTrace();
		}
		input.close();
		keyboard.close();
	}
	
	
	
	private static ArrayList<Word> sort(ArrayList<Word> list){
		
		ArrayList<Word> temp = new ArrayList<Word>();
		Word word = new Word("absolutelynevergoingtoexist",0);
		temp.add(word);
		for(int x=0; x<list.size();x++){
			for(int y=0;y<temp.size();y++){
				if(list.get(x).getNumber()>=temp.get(y).getNumber()){
					temp.add(y, new Word(list.get(x).getWord(),list.get(x).getNumber()));
					break;
				}
			}
		}
		temp.remove(temp.size()-1);
		return temp;
	}
	
	private static int count(ArrayList<Word> list){
		int a=-10;
		for(int x=0; x<list.size();x++){
			if(list.get(x).getNumber()>1)
				a++;
		}
		return a;
	}
	
	private static boolean inTop10(String word){
		boolean bool=false;
		for(String a : top10){
			if(a.equals(word))
				bool=true;
		}
		return bool;
	}


}
