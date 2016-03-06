// test 'Student' class
// instantiates a test object of the Student model class

public class TestStudent {
	public static void main(String[] args) {
		Student mark = new Student("mark n", "123 fake st.");
		mark.addCourseGrade("PHL245", 95);
		mark.addCourseGrade("PHL345", 90);
		mark.addCourseGrade("MAT309", 85);
		mark.printGrades();
		System.out.printf("The average grade is %.2f", mark.getAverageGrade());
	}
}
