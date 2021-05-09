package c_inheritance.b_homework.h2;

public class Instructor extends User {

	private int instructorNo;
	private Student[] students;

	public Instructor() {

	}

	public Instructor(int id, String fullName ,int instructorNo){
		super(id,fullName);
		this.instructorNo=instructorNo;
	}

	public Instructor(int id, String fullName, String email, String password, int instructorNo, Student[] students) {
		super(id, fullName, email, password);
		this.instructorNo = instructorNo;
		this.students = students;
	}

	public int getInstructorNo() {
		return instructorNo;
	}

	public void setInstructorNo(int instructorNo) {
		this.instructorNo = instructorNo;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

}
