package map;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class AcroRunner{
	
	public static void main( String args[] ) throws IOException{
		Acronyms one = new Acronyms(new File("H:/Eclipse Workspace/Map/src/map/acro.dat"));
		System.out.println(one.convert("I drove my PU to TSO to get a HD. My CPU has a virus."));
		System.out.println(one.convert("I sometimes SO when trying to kick a FG. I had 2 RBI at the game."));
		System.out.println(one.convert("I saw 2 PDA infractions in the hall."));
	}
}