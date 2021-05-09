package c_inheritance.b_homework.h2;

public class InstructorManager extends UserManager {

	public void addUser(User user) {
		System.out
				.println("Instructor(s) added: "+user.getId() + ", " + user.getFullName() + ", " + user.getEmail() + ", " + user.getPassword());

	}

	public void addUsers(User[] users) {

		for (User user : users) {
			addUser(user);
		}

	}

	public void showStudents(Student[] students) {

		for (Student student : students) {
			System.out.print("");
			System.out.print("Instructor's students: "+student.getOgrenciNo() + " - " + student.getFullName());
			System.out.println("");
		}

	}

}
