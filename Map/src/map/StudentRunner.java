package map;

import java.util.HashMap;
import java.util.Map;

public class StudentRunner {

	public static void main(String[] args) {
		Map<String, String> students = new HashMap<String, String>();
		while(true){
			StudentPart1.printMenuAndGetChoice(students);
		}
	}

}
