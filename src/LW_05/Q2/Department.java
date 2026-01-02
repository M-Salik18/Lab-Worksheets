package LW_05.Q2;

import java.util.ArrayList;

public class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> coursesOffering;
    private ArrayList<Lecturer> lecturersBelongsTo;

    public Department(String name) {
        this.name = name;
        this.coursesOffering = new ArrayList<>();
        this.lecturersBelongsTo = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void displayInfo() {
        System.out.println("Department Name: " + name);

        System.out.println("\nCourses Offered:");

        for (Course c : coursesOffering) {
            c.getName();
        }

        System.out.println("\nLecturers:");
        for (Lecturer l : lecturersBelongsTo) {
            l.getName();
        }
    }
}
