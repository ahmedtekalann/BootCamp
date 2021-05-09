package b_oopIntro.b_homework.h1;

public class Course {
	int id;
	String name, instructor, detail;

	public Course(int id, String name, String instructor, String detail) {
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.detail = detail;
	}

	static Course course1 = new Course(1, "C# + Angular", "Engin Demirog", "Sifirdan baslayip profesyonelles!");

	static Course course2 = new Course(2, "Java + React", "Engin Demirog", "Sekt�r� daha iyi anla!");

	public static Course[] odev1_Courses = { course1, course2 };
}
