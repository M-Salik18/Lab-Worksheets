package LW_05.Q2;

import java.util.ArrayList;

public class Student extends Person{

    private String studentID;
    private String year;
    Degree degree;
    private ArrayList<Course> coursesEnrolled = new ArrayList<>();

    public Student(String name, String studentID, String year, Degree degree, ArrayList<Course> coursesEnrolled) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
        this.coursesEnrolled = coursesEnrolled;
    }

    public Student(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Student info: "+studentID + " year "+ year);
        System.out.println("Degree info: ");
        degree.getName();
        for (Course c: coursesEnrolled){
            c.getName();
        }

    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    //register for a degree
    public void registerDegree(Degree degree){

    }

    //Display degree info
    public void displayDegreeInfo(){
        degree.displayInfo();
    }

    public void enrollCourse(Course course){
        coursesEnrolled.add(course);
    }


    public void unEnrollCourse(Course course){
        coursesEnrolled.remove(course);
    }

    public void listCoursesEnrolled(){
        for(Course course: coursesEnrolled){
            course.getName();
        }
    }

}
