package hsctf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.print.DocFlavor.INPUT_STREAM;

public class CoinFlip {

	public static void main(String[] args) throws IOException {
		//H:\AT Comp Sci\hsctf coin flip.txt
		Scanner k = new Scanner(System.in);
		//System.out.println("Enter Filename: ");
		//String filename = k.nextLine();
		String filename="H:\\AT Comp Sci\\hsctf coin flip.txt";
		File file = new File(filename);
		FileReader in = new FileReader(file);
		Pattern zero = Pattern.compile("");
		
		int longestrun=0;
		int count=0,run;
		while(true){
		count=0;
		System.out.println(in.read());
		while(in.read()==0){
			//longestrun=count;
			count++;
		}
		run=count;
		if(run>longestrun)
			longestrun=run;
		count=0;
		while(in.read()==1){
			count++;
		}
		run=count;
		if(run>longestrun)
			longestrun=run;
		System.out.println(longestrun);
		}
	}

}
