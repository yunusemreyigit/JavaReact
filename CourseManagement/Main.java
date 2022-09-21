package CourseManagement;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Instructor instructor1 = new Instructor("Engin", "Demiroğ");

        Course JavaReactCourse = new Course("Java&React", instructor1, "Really usefull course.", 5);
        Course JavaCourse = new Course("Java2022", "Really usefull course.", 3);

        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(JavaCourse);
        courses.add(JavaReactCourse);

        instructor1.setCourses(courses);

        Student student = new Student("Yunus Emre", "Yiğit");
        student.addCourse(JavaCourse);

        student.getInfo();
        System.out.println("---------------------");
        JavaCourse.getInfo();
        System.out.println("---------------------");
        instructor1.getInfo();

    }
}