//	Student model class
//	models a student's report card
//	-name:String
//	-address:String
//	-numCourses:int = 0
//	-courses:String[]
//	-grades:int[]
//	+Student(name:String, address:String)
//	+getName():String
//	+getAddress():String
//	+setAddress(address:String):void
//	+toString():String
//	+addCourseGrade(course:String, grade:int):void
//	+printGrade():void
//	+getAverageGrade():double

public class Student {
	
	//	private member fields (variables)
	private String name;
	private String address;
	//	courses taken and corresp grades are kept in two arrays of same length
	private String[] courses;
	private int[] grades;	//	a grade is between 0 and 100
	private int numCourses;
	private static final int MAX_COURSES = 30;	//	static, common to all instances
	
	//	constructor
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSES];	//	allocate arrays
		grades = new int[MAX_COURSES];
		numCourses = 0;	//	no courses so far
	}
	
	//	public getters and setters for private variables
	//	getters
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	//	setter
	//	just one, for address
	public void setAddress(String address) {
		this.address = address;
	}
	
	//	public toString() for object/instance description
	public String toString() {
		return name + "(" + address + ").";
	}
	
	//	public methods
	//	add a course with grade
	public void addCourseGrade(String course, int grade) {
		//	starts with numCourses = 0, so 0th position in array
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;	//	increment # of courses
	}
	
	//	print all courses taken, with grades
	public void printGrades() {
		System.out.print(this);	//	toString()
		for (int i = 0; i < numCourses; ++i) {
			System.out.print(" "+ courses[i] + ": " + grades[i] + ".");
		}
		System.out.println();
	}
	
	//	compute average grade
	public double getAverageGrade() {
		int sum = 0;
		for (int i = 0; i < numCourses; ++i) {
			sum += grades[i];
		}
		return (double)sum/numCourses;
	}
}
