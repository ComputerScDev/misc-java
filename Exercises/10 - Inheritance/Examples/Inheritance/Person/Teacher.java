//	Teacher model subclass of Person superclass
//	-numCourses:int
//	-courses:String[]
//	+Teacher(name:String, address:String)
//	+toString():String
//	+addCourse(course:String):boolean
//	+removeCourse(course:String):boolean

public class Teacher extends Person {	
	
	private int numCourses;
	private String[] courses;
	private static final int MAX_COURSES = 10;	// constant (static final)
	
	//	constructor
	public Teacher(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[MAX_COURSES];
	}
	
	@Override
	public String toString() {
		return "teacher: " + super.toString();
	}
	
	//	+addCourse(course:String):boolean
	//	return false if duplicate course
	public boolean addCourse(String course) {
		// check if course exists in courselist
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				return false
			}
		}
		courses[numCourses] = course;
		numCourses++;
		return true;
	}
	
	//	+removeCourse(course:String):boolean
	//	return false if the course does not exist in courselist
	public boolean removeCourse(String course) {
		//	search for course index
		for (int i = 0; i < numCourses; i++) {
			if (courses[i].equals(course)) {
				courseIndex = i;
				break;
			}
		}
		if (courseIndex == numCourses) {	// cannot find input course
			return false;
		} else {	// remove the course and re-arrange the courselist array
			for (int i = courseIndex; i < numCourses - 1; i++) {
				courses[i] = courses[i + 1];
			}
			numCourses--;
			return true;
		}
	}
}
