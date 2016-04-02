//	Student model subclass of Person superclass
//	-numCourses:int
//	-courses:String[]
//	-grades:int[]
//	+Student(name:String, address:String)
//	+toString():String
//	+addCourseGrade(course:String, grade:int):void
//	+printGrades():void
//	+getAverageGrade():double

public class Student extends Person {
	
	private int numCourses;
	private String[] courses;
	private int[] grades;
	private static final int MAX_COURSES = 30;	// constant (static final)
	
	public Student(String name, String address) {
		super(name, address);	// invokes superclass' constructor
		numCourses = 0;
		courses = new String[MAX_COURSES];
		grades = new int[MAX_COURSES];
	}
	
	@Override
	public String toString() {
		return "student: " + super.toString();
	}
	
	//	+addCourseGrade(course:String, grade:int):void
	//	add a course and its grade - no validation in this method
	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}
	
	//	+printGrades():void
	//	print all courses taken and their grade
	public void printGrades() {
		System.out.print(this);
		for (int i = 0; i < numCourses; ++i) {
			System.out.print(" " + courses[i] + ":" + grades[i]);
		}
		System.out.println();
	}
	
	//	+getAverageGrade():double
	//	compute average grade
	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < numCourses; i++) {
			sum += grades[i];
		}
		return (double)sum/numCourses;
	}
}
