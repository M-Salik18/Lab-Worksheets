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
        this.departmentHead = null;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Appoint/Display Head
    public void appointDepartmentHead(Lecturer lecturer) {
        this.departmentHead = lecturer;
    }

    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) {
            departmentHead.displayInfo();
        } else {
            System.out.println("No department head assigned.");
        }
    }

    // Courses & Lecturers
    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void addLecturer(Lecturer lecturer) {
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer) {
        lecturersBelongsTo.remove(lecturer);
    }

    // Display Department Info
    public void displayInfo() {
        System.out.println("Department Name: " + name);

        if (!coursesOffering.isEmpty()) {
            System.out.println("Courses Offered:");
            for (Course c : coursesOffering) {
                System.out.println("- " + c.getName());
            }
        } else {
            System.out.println("No courses offered.");
        }

        if (!lecturersBelongsTo.isEmpty()) {
            System.out.println("Lecturers:");
            for (Lecturer l : lecturersBelongsTo) {
                System.out.println("- " + l.getName());
            }
        } else {
            System.out.println("No lecturers assigned.");
        }
    }
}
