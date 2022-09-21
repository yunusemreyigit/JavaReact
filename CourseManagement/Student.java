package CourseManagement;

import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private ArrayList<Course> coursesTaken = new ArrayList<Course>();

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student(String name, String surname, ArrayList<Course> coursesTaken) {
        this.name = name;
        this.surname = surname;
        this.coursesTaken = coursesTaken;
    }

    public void getInfo() {
        System.out.println("Name :" + name);
        System.out.println("Surname : " + surname);
        System.out.print("Courses : ");
        getNameofCourses();
    }

    public void getNameofCourses() {
        for (Course course : coursesTaken) {
            System.out.println(" -" + course.getCourseName());
        }
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

    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(ArrayList<Course> coursesTaken) {
        this.coursesTaken = coursesTaken;
        for (Course course : coursesTaken) {
            course.addStudent(this);
        }
    }

    public void addCourse(Course courseTaken) {
        if (courseTaken.getCapacity() > 0) {
            coursesTaken.add(courseTaken);
            courseTaken.addStudent(this);
        } else {
            System.err.println("You can't join the class.");
        }

    }

}
