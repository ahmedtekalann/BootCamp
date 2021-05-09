package b_oopIntro.b_homework.h1;

public class CourseService {
	public void getTheAllCourses() {
		for (Course coursee : Course.odev1_Courses) {
			System.out.println(coursee.name);
		}
		System.out.println("Toplam " + Course.odev1_Courses.length + " tane kurs mevcut.");
	}

	public void goToCourse1() {
		for (Course coursee : Course.odev1_Courses) {
			if (coursee == Course.course1)
				System.out.println("Hosgeldiniz, bu kurs " + Course.course1.name + " kursudur.");
		}
	}

	public void joinTheCourse1() {
		System.out.println("Tebrikler, katilim sagladiniz.");
		goToCourse1();
	}

	public void goToCourse2() {
		for (Course coursee : Course.odev1_Courses) {
			if (coursee == Course.course2)
				System.out.println("Hosgeldiniz, bu kurs " + Course.course2.name + " kursudur.");
		}
	}

	public void joinTheCourse2() {
		System.out.println("Tebrikler, katilim sagladiniz.");
		goToCourse2();
	}
}
