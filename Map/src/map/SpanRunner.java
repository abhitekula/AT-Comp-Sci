package map;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanRunner
{
	public static void main( String args[] ) throws IOException
	{
		SpanishToEnglish translate = new SpanishToEnglish();
		Scanner file = new Scanner(new File("H:/Eclipse Workspace/Map/src/map/spantoeng.dat")); //C:/Users/17at0666/Downloads/spantoeng.dat
		while(file.hasNextLine()){
			translate.putEntry(file.nextLine());
		}
		System.out.println(translate.translate("yo quiero una ordenador virus"));
		System.out.println(translate.translate("todas de los muchachos tienen interno memoria"));
		System.out.println(translate.translate("mi pelo es cafe"));
		System.out.println(translate.translate("tu quieres tinta con su papel"));
		System.out.println(translate.translate("rearrancar el ordenador a vacio el pantalla"));
	}
	
}