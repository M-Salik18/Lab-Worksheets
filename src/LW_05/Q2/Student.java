package LW_05.Q2;

import java.util.ArrayList;

public class Student extends Person {

    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled;

    public Student(String name, String studentID, String year) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.coursesEnrolled = new ArrayList<>();
        this.degree = null;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void registerDegree(Degree degree) {
        this.degree = degree;
        degree.setNumberOfStudents(degree.getNumberOfStudents() + 1);
        System.out.println("Student " + getStudentID() + " registered for " + degree.getName());
    }

    public void displayDegreeInfo() {
        if (degree != null) {
            degree.displayInfo();
        } else {
            System.out.println("No degree assigned.");
        }
    }

    // Enroll/Unenroll Courses
    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
    }

    public void unEnrollCourse(Course course) {
        coursesEnrolled.remove(course);
    }

    public void listCoursesEnrolled() {
        if (coursesEnrolled.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            for (Course c : coursesEnrolled) {
                System.out.println("- " + c.getName());
            }
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);

        if (degree != null) {
            System.out.println("Degree: " + degree.getName());
        } else {
            System.out.println("Degree: Not registered");
        }

        System.out.println("Courses Enrolled:");
        listCoursesEnrolled();
    }
}
