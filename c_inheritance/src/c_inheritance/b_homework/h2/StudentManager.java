package c_inheritance.b_homework.h2;

public class StudentManager extends UserManager {

	public void addUser(User user) {
		System.out
				.println("Student(s) added: "+user.getId() + ", " + user.getFullName() + ", " + user.getEmail() + ", " + user.getPassword());

	}

	public void addUsers(User[] users) {

		for (User user : users) {
			addUser(user);
		}

	}

	public void course(Student.Course course) {

		System.out.println("Kurs: " + course.getCourseNumber() + ", " + course.getCourseName());

	}

	public void courses(Student.Course[] courses) {

		for (Student.Course course : courses) {
			course(course);
		}

	}


	public void numberOfStudent(Student[] students) {
		System.out.println("There are "+students.length+" students in total.");
	}

}
