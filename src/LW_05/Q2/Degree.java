package LW_05.Q2;

import java.util.ArrayList;

public class Degree {
    private String name;
    private int numberOfStudents;
    private ArrayList<Course> courseOffering = new ArrayList<>();

    public void displayInfo(){
        System.out.println("Degree details: ");
        System.out.println("Name: "+name+ " number of students: "+ numberOfStudents);
        System.out.println("Courses offered: ");
        for (Course course: courseOffering){
            course.getName();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void offerCourse(Course course){
        courseOffering.add(course);
    }

    public void withdrawCourse(Course course){
        courseOffering.remove(course);
    }

    public void listofCoursesOffering(){
        System.out.println("Courses offered: ");
        for (Course course: courseOffering){
            course.getName();
        }
    }
}
