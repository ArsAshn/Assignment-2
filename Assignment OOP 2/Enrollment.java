public class Enrollment {

    private Student student;
    private Course course;
    private String semester;

    public Enrollment(Student student, Course course, String semester) {
        this.student = student;
        this.course = course;
        this.semester = semester;
    }

    public Student getStudent() { return student; }
    public Course getCourse()   { return course; }
    public String getSemester() { return semester; }

    public void setStudent(Student student)   { this.student = student; }
    public void setCourse(Course course)      { this.course = course; }
    public void setSemester(String semester)  { this.semester = semester; }

    public void displayEnrollment() {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Enrolled Course: " + course.getCourseName());
        System.out.println("Semester: " + semester);
    }
}