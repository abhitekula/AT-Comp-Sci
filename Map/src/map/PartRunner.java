package map;

import static java.lang.System.*;

import java.io.FileNotFoundException;

//Files needed
 //Part.java
 //PartList.java

public class PartRunner
{
	public static void main(String[] args) throws FileNotFoundException
	{
		PartList prog = new PartList("H:/Eclipse Workspace/Map/src/map/partinfo.dat");
		out.println(prog);
	}
}
