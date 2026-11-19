public class Course {

    // Private attributes to protect course information
    private String courseCode;
    private String courseName;
    private int creditHours;

    // Constructor to initialise course information
    public Course(String courseCode, String courseName, int creditHours) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    // Getter methods
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    // Setter methods
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    // Method to display course information
    public void displayCourse() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit Hours: " + creditHours);
    }
}
