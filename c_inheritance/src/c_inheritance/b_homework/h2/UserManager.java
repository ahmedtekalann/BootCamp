package c_inheritance.b_homework.h2;

public class UserManager { // Base

	public void addUser(User user) {
		System.out
				.println("User(s) added: "+user.getId() + ", " + user.getFullName() + ", " + user.getEmail() + ", " + user.getPassword());

	}

	public void addUsers(User[] users) {

		for (User user : users) {
			addUser(user);
		}

	}

	public void showStudents(Student[] students) {

		for (Student student : students) {
			System.out.print("");
			System.out.print("All students: "+student.getOgrenciNo() + " - " + student.getFullName());
			System.out.println("");
		}

	}

}
