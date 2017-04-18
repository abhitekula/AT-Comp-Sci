package map;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentPart2 {
	   /**
	   Prints the options menu and returns the letter that the user types does not check for invalid selection
	      @return the next token on the input stream
	   */
	
		static Scanner k = new Scanner(System.in);
		static String fname;
		static String lname;
		static String grade;
		static Student student;
		static int id;
		static int ans;
		static Set<Student> keys = new HashSet<Student>();
	
	   public static void printMenuAndGetChoice(Map<Student, String> gradeMap, Map<Integer, Student> idmap){
		   System.out.println("Choose One of the Following Options:");
		   System.out.println("1) Print Grades");
		   System.out.println("2) Modify Student");
		   System.out.println("3) Remove Student");
		   System.out.println("4) Add Student");
		   ans = Integer.parseInt(k.nextLine());
		   switch(ans){
		   		case 1:
		   			printGrades(gradeMap);
		   			break;
		   		case 2:
		   			modifyStudent(gradeMap,idmap);
		   			break;
		   		case 3:
		   			removeStudent(gradeMap,idmap);
		   			break;
		   		case 4:
		   			addStudent(gradeMap,idmap);
		   			break;
		   		default:
		   			System.out.println("Enter a valid choice.");
		   			printMenuAndGetChoice(gradeMap,idmap);
		   			break;
		   }
	   }

	   /**
	      Prints the students and grades
	      @param gradeMap the map to print
	   */
	   public static void printGrades(Map<Student, String> gradeMap){
		   keys=gradeMap.keySet();
		   System.out.println("Student Grade List");
		   for(Student a : keys){
			   System.out.println(a + ": " + gradeMap.get(a));
		   }
	   }
	   
	   /**
	   Modifies an entry based on user input.  Prints an error if an invalid student is modified
	      @param gradeMap the map to modify
	      @param idToStudentMap  the map to associate student id with a student
	   */
	   public static void modifyStudent(Map<Student, String> gradeMap,
	         Map<Integer, Student> idMap){
		   System.out.println("Enter Student's ID:");
		   id = Integer.parseInt(k.nextLine());
		   System.out.println("Enter Student's New Grade:");
		   grade = k.nextLine();
		   if(idMap.containsKey(id)){
			   student=idMap.get(id);
			   gradeMap.put(student, grade);
		   }
		   else
			   System.out.println("This student does not exist:");
		   
	   }
	   /**
	      Removes a student from the map based on user input
	      @param gradeMap the map to remove the student from
	      @param idToStudentMap the map to associate student id with a student
	   */
	   public static void removeStudent(Map<Student, String> gradeMap,
	         Map<Integer, Student> idMap){
		   System.out.println("Enter ID of Student to Remove:");
		   id = Integer.parseInt(k.nextLine());
		   gradeMap.remove(idMap.get(id));
	   }
	   /**
	      Adds a student based on user input.  Prints an error if a student
	      is added that already exists in the map.
	      @param idToGradeMap the map to add the student to
	      @param idToStudentMap the map to associate student id with a student
	   */
	   public static void addStudent(Map<Student, String> gradeMap,
	         Map<Integer, Student> idMap){
		   System.out.println("Enter Student's First Name:");
		   fname = k.nextLine();
		   System.out.println("Enter Student's Last Name:");
		   lname = k.nextLine();
		   System.out.println("Enter Student's Grade:");
		   grade = k.nextLine();
		   System.out.println("Enter Student's ID:");
		   id = Integer.parseInt(k.nextLine());
		   student = new Student(fname,lname,id);
		   if(!gradeMap.containsKey(student) && !idMap.containsKey(idMap)){
			   gradeMap.put(student, grade);
			   idMap.put(id, student);
		   }
		   else
			   System.out.println("This student has already been added to the map:");
	   }

 
}
