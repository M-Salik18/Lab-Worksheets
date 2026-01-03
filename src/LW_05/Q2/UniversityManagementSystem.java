package LW_05.Q2;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Departments
        Department dep1 = new Department("Software Engineering");
        Department dep2 = new Department("Management");

        // Degrees
        Degree degree1 = new Degree("Computer Science");
        Degree degree2 = new Degree("MIT");
        Degree degree3 = new Degree("Finance");

        // Courses
        Course c1 = new Course("OOP");
        Course c2 = new Course("SE");
        Course c3 = new Course("Statistics");

        // Lecturers
        Lecturer lecturer1 = new Lecturer("Amal", "Department Head");
        Lecturer lecturer2 = new Lecturer("Kamal", "Senior Lecturer");

        // Students
        Student s1 = new Student("Ravi", "001", "2022");
        Student s2 = new Student("Mohammed", "002", "2022");

        // Register students to degrees
        s1.registerDegree(degree1);
        s2.registerDegree(degree2);

        // Assign lecturers to courses
        c1.addLecturerInCharge(lecturer1);
        c2.addLecturerInCharge(lecturer1);
        c3.addLecturerInCharge(lecturer2);

        // Assign courses to degrees
        c1.addDegreeBelongsTo(degree1);
        c2.addDegreeBelongsTo(degree1);
        c3.addDegreeBelongsTo(degree3);

        degree1.offerCourse(c1);
        degree1.offerCourse(c2);
        degree3.offerCourse(c3);

        // Assign lecturers to departments
        lecturer1.setDepartment(dep1);
        lecturer2.setDepartment(dep1);

        // Add lecturers and courses to department
        dep1.addLecturer(lecturer1);
        dep1.addLecturer(lecturer2);
        dep1.offerCourse(c1);
        dep1.offerCourse(c2);
        dep1.offerCourse(c3);

        // Assign courses to lecturers
        lecturer1.addCourse(c1);
        lecturer1.addCourse(c2);
        lecturer2.addCourse(c3);

        // Display info
        System.out.println("\n--- Lecturers ---");
        lecturer1.displayInfo();
        System.out.println();
        lecturer2.displayInfo();

        System.out.println("\n--- Students ---");
        s1.displayInfo();
        System.out.println();
        s2.displayInfo();

        System.out.println("\n--- Courses ---");
        c1.displayInfo();
        System.out.println();
        c2.displayInfo();
        System.out.println();
        c3.displayInfo();

        System.out.println("\n--- Departments ---");
        dep1.displayInfo();
        System.out.println();
        dep2.displayInfo();

        System.out.println("\n--- Degrees ---");
        degree1.displayInfo();
        System.out.println();
        degree2.displayInfo();
        System.out.println();
        degree3.displayInfo();
    }
}
