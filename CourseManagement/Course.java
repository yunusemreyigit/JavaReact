package CourseManagement;

public class Course {
    private String courseName;
    private Instructor instructor;
    private String detail;

    private int maxStudentCapacity;
    private int remainingCapacity;
    private Student[] students;

    public Course(String courseName, Instructor instructor, String detail, int maxStudentCapacity) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.detail = detail;
        this.maxStudentCapacity = remainingCapacity = maxStudentCapacity;
        students = new Student[maxStudentCapacity];
    }

    public Course(String courseName, String detail, int maxStudentCapacity) {
        this.courseName = courseName;
        this.detail = detail;
        this.maxStudentCapacity = remainingCapacity = maxStudentCapacity;
        students = new Student[maxStudentCapacity];
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public String getDetail() {
        return detail;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public int getCapacity() {
        return remainingCapacity;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                remainingCapacity--;
                break;
            }
        }
        System.out.println("You can't add more student in this course.");
    }

    public void getInfo() {
        System.out.println("Course name :" + getCourseName());
        System.out.println("Course instructor : " + getInstructor().getName() + " " + getInstructor().getSurname());
        System.out.println("Max. student capacity : " + maxStudentCapacity);
        System.out.println("Students : ");
        getStudentsName();
    }

    private void getStudentsName() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student.getName());
            }
        }
    }

}