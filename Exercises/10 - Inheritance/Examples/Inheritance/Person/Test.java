//	Test class for Person and all its subclasses

public class Test {	
	
	public static void main(String[] args) {
		//	test student subclass
		Student s1 = new Student("M.N.", "home #1");
		s1.addCourseGrade("MAT327", 85);
		s1.addCourseGrade("PHL345", 90);
		s1.printGrades();
		System.out.println(s1.getName() + "'s average is " + s1.getAverageGrade());
		
		//	test teacher subclass
		Teacher t1 = new Teacher("L.N.", "home #2");
		System.out.println(t1);
		String[] courses = {"A", "B", "C"};
		for (String course : courses) {
			if (t1.addCourse(course)) {
				System.out.println(course + " added.");
			} else {
				System.out.println(course + " cannot be added");
			}
		}
		
		for (String course : courses) {
			if (t1.removeCourse(course)) {
				System.out.println(course + " removed.");
			} else {
				System.out.println(course + " cannot be removed.");
			}
		}
	}
}
