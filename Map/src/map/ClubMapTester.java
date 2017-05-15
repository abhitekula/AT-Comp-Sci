package map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class ClubMapTester {
	
	public static void main(String[] args) throws FileNotFoundException{
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the filename:");
		//"H:/Eclipse Workspace/Map/src/map/student.txt"
		String filename = k.nextLine();
		File file = new File(filename);
		Scanner input = new Scanner(file);
		ClubMap map = new ClubMap();
		Student temp;
		Scanner line;
		while(input.hasNextLine()){
			line = new Scanner(input.nextLine());
			//System.out.println(input.nextLine());
			temp = new Student();
			temp.setLname(line.next());
			temp.setFName(line.next());
			temp.setId(Integer.parseInt(line.next()));
			map.addStudent(line.next(), temp);
		}
		map.display();
		System.out.println("\nMath:");
		map.clubRoster("Math");
	}
	
}
