package LW_03.Q4;

public class Course {
    private String courseName;
    private String courseCode;

    public Course() {
    }

    public Course(String courseName, String courseCode, Lecture lecture1) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.lecture1 = lecture1;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    Lecture lecture1 = new Lecture();

    public Lecture getLecture1() {
        return lecture1;
    }

    public void setLecture1(Lecture lecture1) {
        this.lecture1 = lecture1;
    }
}
