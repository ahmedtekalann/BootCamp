package b_oopIntro.b_homework.h1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CourseService odev1_CourseService = new CourseService();

		odev1_CourseService.getTheAllCourses();

		Scanner scanner = new Scanner(System.in);
		int id;
		System.out.print("Id girin: ");
		id = scanner.nextInt();
		if (id == Course.course1.id)
			odev1_CourseService.joinTheCourse1();
		else if (id == Course.course2.id)
			odev1_CourseService.joinTheCourse2();
		scanner.close();

	}

}
