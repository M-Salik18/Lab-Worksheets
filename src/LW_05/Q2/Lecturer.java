package LW_05.Q2;

import java.util.ArrayList;

public class Lecturer extends Person {

    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    // Constructor
    public Lecturer(String name, String position) {
        super(name);
        this.position = position;
        this.coursesTeaching = new ArrayList<>();
        this.department = null;
    }

    // Getters and setters
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

    // Add/Remove course
    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }

    public void removeCourse(Course course) {
        coursesTeaching.remove(course);
    }

    public void listCoursesTeaching() {
        if (coursesTeaching.isEmpty()) {
            System.out.println("No courses assigned.");
        } else {
            for (Course c : coursesTeaching) {
                System.out.println("- " + c.getName());
            }
        }
    }

    public void displayDepartmentInfo() {
        if (department != null) {
            department.displayInfo();
        } else {
            System.out.println("No department assigned.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer Name: " + getName());
        System.out.println("Position: " + position);

        if (department != null) {
            System.out.println("Department: " + department.getName());
        } else {
            System.out.println("Department: Not assigned");
        }

        System.out.println("Courses Teaching:");
        listCoursesTeaching();
    }
}
