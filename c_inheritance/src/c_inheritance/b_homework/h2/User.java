package c_inheritance.b_homework.h2;

public class User { // base

	private int id;
	private String fullName, email, password;
	private int courseNumber;
	private String courseName;

	public User() {

	}

	public User(int id, String name){
		this();
		this.id=id;
		this.fullName=name;
	}

	public User(int id, String name, String email, String password) {
		this();
		this.id = id;
		this.fullName = name;
		this.email = email;
		this.password = password;

	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String name) {
		this.fullName = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
