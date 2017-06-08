package graph;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		//"H:/Eclipse Workspace/Graph/src/graph/graph1.dat"
		Scanner file = new Scanner(new File("H:/Eclipse Workspace/Graph/src/graph/graph1.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine();
		for(int x=0; x<howManyTimes; x++)
		{
			Graph graph = new Graph(file.nextLine());
			graph.check(file.nextLine());
		}
	}
}