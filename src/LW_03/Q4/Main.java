package LW_03.Q4;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        Lecture lecture = new Lecture();
        Student student = new Student();
        course.setCourseName("ICT");
        course.setCourseCode("CSCI21022");

        lecture.setLecturerName("Riyas");
        lecture.setCourseTeaching("ICT");

        course.setLecture1(lecture);

        student.setStudentName("John");
        student.setDegreeName("CS");
        student.setCourseFollowing("ICT");

        System.out.println("Student "+student.getStudentName()+ " who follows "+student.getDegreeName()+" degree studies course "+course.getCourseName()+" from "+course.getLecture1().getLecturerName()+" sir.");
        System.out.println("");
    }

}
