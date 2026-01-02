package LW_05.Q2;


import java.util.ArrayList;

public class Lecturer extends Person{
    private String position;

    Department department;

    ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position) {
        super(name);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<Course> getCoursesTeaching() {
        return coursesTeaching;
    }

    public void setCoursesTeaching(ArrayList<Course> coursesTeaching) {
        this.coursesTeaching = coursesTeaching;
    }

    public Lecturer(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer Information: " + getName() + " " + getPosition());
        System.out.println("Courses taught: ");
        for (Course c : coursesTeaching){
            c.getName();
        }
        System.out.println("Department he/she works: " + department.getName());


    }

    //Department info
    public void displayDepartment(){
        department.displayInfo();
    }

    public void addCourse(Course newCourse){
        coursesTeaching.add(newCourse);
    }

    public void removeCourse(Course course){
        coursesTeaching.remove(course);
    }

    //List of courses teaching
    public void listCourseTeaching(){
        for(Course course: coursesTeaching){
            course.getName();
        }
    }
}
