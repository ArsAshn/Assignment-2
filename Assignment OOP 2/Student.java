/**
 * Base class representing a general student.
 * All attributes are private (encapsulation) and accessed via getters/setters.
 */
public class Student implements Billable {

    private String studentId;
    private String name;
    private int age;
    private String email;
    private String programme;
    private int creditHours;
    private double feePerCreditHour;

    public Student(String studentId, String name, int age, String email,
                   String programme, int creditHours, double feePerCreditHour) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.programme = programme;
        setCreditHours(creditHours);           // reuse setters so validation applies
        setFeePerCreditHour(feePerCreditHour);
    }

    // Getters
    public String getStudentId()        { return studentId; }
    public String getName()             { return name; }
    public int getAge()                 { return age; }
    public String getEmail()            { return email; }
    public String getProgramme()        { return programme; }
    public int getCreditHours()         { return creditHours; }
    public double getFeePerCreditHour() { return feePerCreditHour; }

    // Setters
    public void setName(String name)           { this.name = name; }
    public void setAge(int age)                { this.age = age; }
    public void setEmail(String email)         { this.email = email; }
    public void setProgramme(String programme) { this.programme = programme; }

    public void setCreditHours(int creditHours) {
        if (creditHours > 0) {
            this.creditHours = creditHours;
        } else {
            System.out.println("Invalid credit hours! Must be more than 0.");
            this.creditHours = 1;
        }
    }

    public void setFeePerCreditHour(double feePerCreditHour) {
        if (feePerCreditHour > 0) {
            this.feePerCreditHour = feePerCreditHour;
        } else {
            System.out.println("Invalid fee! Must be more than 0.");
            this.feePerCreditHour = 1.0;
        }
    }

    /** Default fee: credit hours x fee per credit hour. Derived classes override this. */
    @Override
    public double calculateTuitionFee() {
        return creditHours * feePerCreditHour;
    }

    @Override
    public String getDetails() {
        return "[" + studentId + "] " + name + " | " + programme
                + " | Credit hours: " + creditHours;
    }
}