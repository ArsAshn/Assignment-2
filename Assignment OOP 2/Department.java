
public class Department {

    // Private attributes
    private String departmentName;
    private String departmentCode;
    private String faculty;

    // Constructor
    public Department(String departmentName, String departmentCode,
                      String faculty) {
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
        this.faculty = faculty;
    }

    // Getter methods
    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getFaculty() {
        return faculty;
    }

    // Setter methods
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    // Method to display department information
    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        System.out.println("Department Code: " + departmentCode);
        System.out.println("Faculty: " + faculty);
    }
}
