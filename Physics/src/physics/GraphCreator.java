package physics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class GraphCreator {

	public static void main(String[] args) throws FileNotFoundException{
		String filename = "\\input.csv";
		File file = new File(filename);
		Scanner i = new Scanner(file);
		while(i.hasNext()){
			System.out.println("" + i.next());
		}
		i.close();
	}

}
