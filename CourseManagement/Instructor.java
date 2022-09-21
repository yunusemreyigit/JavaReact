package CourseManagement;

import java.util.ArrayList;

public class Instructor {
    private String name;
    private String surname;
    private ArrayList<Course> coursesGiven = new ArrayList<Course>();

    public Instructor(String name, String surname, ArrayList<Course> coursesGiven) {
        this.name = name;
        this.surname = surname;
        this.coursesGiven = coursesGiven;
    }

    public Instructor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Course> getCourses() {
        return coursesGiven;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.coursesGiven = courses;
        for (Course course : courses) {
            course.setInstructor(this);
        }
    }

    public void setCourse(Course course) {
        this.coursesGiven.add(course);
        course.setInstructor(this);
    }

    public void getInfo() {
        System.out.println("Instructor's name : " + getName());
        System.out.println("Instructor's surname : " + getSurname());
        System.out.println("Instructor's courses : ");
        getCoursesName();
    }

    private void getCoursesName() {
        for (Course course : coursesGiven) {
            System.out.println(course.getCourseName());
        }
    }
}
