package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class StudentRunnerPart2 {

	public static void main(String[] args) {
		Map<Student, String> students = new TreeMap<Student, String>();
		Map<Integer, Student> idmap = new HashMap<Integer, Student>();
		while(true){
			StudentPart2.printMenuAndGetChoice(students,idmap);
		}
	}

}
