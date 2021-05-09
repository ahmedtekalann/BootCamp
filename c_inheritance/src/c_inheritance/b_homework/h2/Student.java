package c_inheritance.b_homework.h2;

public class Student extends User {

	private int ogrenciNo;

	public class Course {

		int courseNumber;
		String courseName;

		public Course() {

		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public int getCourseNumber() {
			return courseNumber;
		}

		public void setCourseNumber(int courseNumber) {
			this.courseNumber = courseNumber;
		}

	}

	public Student() {

	}



	public Student(int id, String fullName, String email, String password, int ogrenciNo) {

		super(id, fullName, email, password);
		this.ogrenciNo = ogrenciNo;

	}

	public int getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}


}
