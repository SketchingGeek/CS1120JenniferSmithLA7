/* Assignment: CS1120 LA7 Course Registration System
 * Author: Jennifer N. Smith
 * Date: 4/14/18
 * Reference: LA7_Spring2018.docx (LA7 Instructions)
 */


import java.util.ArrayList;

public class Course implements ICourse {
	// This is a comma-separated input file. 
	// Data stored in the file in order: courseDept, courseNumber, capacity (maximum number of students)
	String courseDept;
	int courseNumber;
	int capacity;
	ArrayList <String> students = new ArrayList <String> ();
	
	/**
	 * Constructs a course
	 * @param courseDept Course department
	 * @param courseNumber Course number
	 * @param capacity Course capacity
	 */
	
	public Course(String courseDept,int courseNumber,int capacity) { 
		this.courseDept = courseDept;
		this.courseNumber = courseNumber;
		this.capacity = capacity;
		
	}
	
	/**
	 * Determine if the capacity for this course has been reached.
	 */
	
	@Override
	public boolean isFull() {
		
		return (capacity == students.size());
	}

	/**
	 * Add this student to the arraylist for enrolled students for this course.
	 */
	
	@Override
	public void addStudent(String name) {
		students.add(name);
	}

	/**
	 * Print the class list for this course.
	 */
	
	@Override
	public void printClassList() {
		System.out.println("\nClass List for "+courseDept+" "+courseNumber);
		for (String oneStudent:students) {
			System.out.println(oneStudent);
		}
	}

}
