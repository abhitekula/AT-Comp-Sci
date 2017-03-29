package map;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add more test cases	
		Relatives relatives = new Relatives();
		Scanner file = new Scanner(new File("H:/Eclipse Workspace/Map/src/map/relatives.dat")); //C:/Users/17at0666/Downloads/spantoeng.dat
		while(file.hasNextLine()){
			relatives.setPersonRelative(file.nextLine());
		}
		System.out.println(relatives);
	}
}