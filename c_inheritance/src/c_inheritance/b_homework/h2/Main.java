package c_inheritance.b_homework.h2;

public class Main {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("These are the users used by 'UserManager' method: ");

        User user = new User(1,"Engin Demiroğ","engindemirog@kodlama.io","123");
        UserManager userManager = new UserManager();
        userManager.addUser(user);

        User user2 = new User(1,"Ahmed Tekalan","ahmettekalan@gmail.com","456");
        User[] users = {user,user2};
        userManager.addUsers(users);

        User user1 = new Instructor(2, "Abdullah Sönmez",3);
        userManager.addUser(user1);

        User user3 = new Student(2,"Ali Atay","aliatay@kodlama.io","789",100);
        //
        userManager.addUser(user3);

        System.out.println("");
        System.out.println("These are the users used by 'StudentManager' method (overriding):");

        StudentManager studentManager = new StudentManager();

        Student user4 = new Student(3,"Ayşe Sarı","aysesari@kodlama.io","901",101);
        Student.Course user4course = user4.new Course();
        user4course.setCourseNumber(1);
        user4course.setCourseName("C# and Angular");
        studentManager.addUser(user4);
        studentManager.course(user4course);
        Student user5 = new Student(4,"Dilan Dizdar","didi@kodlama.io","902",102);
        Student.Course user5course = user4.new Course();
        user5course.setCourseNumber(2);
        user5course.setCourseName("Java and React");
        studentManager.addUser(user5);
        studentManager.course(user5course);
        Student user7 = new Student(5,"Ahmet Ak","ahmetak@kodlama.io","903",103);
        Student.Course user7course = user4.new Course();
        user7course.setCourseNumber(3);
        user7course.setCourseName("Programlamaya Giriş");
        studentManager.addUser(user7);
        studentManager.course(user7course);

        System.out.println("");
        System.out.println("Instructor's Students:");
        InstructorManager instructorManager = new InstructorManager();
        Student[] studentsOfUser6 = new Student[]{user4, user5};
        Instructor user6 = new Instructor(2,"Şadi Evren Şeker","sadievrenseker@kodalama.io","345", 2,studentsOfUser6);
        instructorManager.showStudents(studentsOfUser6);

        System.out.println("");

        Student[] allStudents = {user4,user5,user7};
        userManager.showStudents(allStudents);
        studentManager.numberOfStudent(allStudents);

        System.out.println("");

        Student.Course[] studentsCourses = { user4course, user5course, user7course };
        studentManager.courses(studentsCourses);

    }
}