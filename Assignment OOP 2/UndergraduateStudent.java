/** Derived class 1: adds CGPA and year of study. */
public class UndergraduateStudent extends Student {

    private double cgpa;
    private int yearOfStudy;

    public UndergraduateStudent(String studentId, String name, int age, String email,
                                String programme, int creditHours, double feePerCreditHour,
                                double cgpa, int yearOfStudy) {
        super(studentId, name, age, email, programme, creditHours, feePerCreditHour);
        setCgpa(cgpa);
        this.yearOfStudy = yearOfStudy;
    }

    public double getCgpa()     { return cgpa; }
    public int getYearOfStudy() { return yearOfStudy; }
    public void setYearOfStudy(int yearOfStudy) { this.yearOfStudy = yearOfStudy; }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.00 and 4.00.");
            this.cgpa = 0.0;
        }
    }

    /** Academic status based on CGPA (from groupmate's original Student class). */
    public String getAcademicStatus() {
        if (cgpa >= 3.50) {
            return "Excellent";
        } else if (cgpa >= 3.00) {
            return "Good";
        } else if (cgpa >= 2.00) {
            return "Satisfactory";
        } else {
            return "Needs Improvement";
        }
    }

    /** Senior student = year 3 or above. */
    public boolean isSeniorStudent() {
        return yearOfStudy >= 3;
    }

    /** Polymorphism: 10% Dean's List discount for CGPA >= 3.50. */
    @Override
    public double calculateTuitionFee() {
        double total = super.calculateTuitionFee();
        if (cgpa >= 3.50) {
            total *= 0.90;
        }
        return total;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " | Undergraduate, Year " + yearOfStudy
                + ", CGPA: " + cgpa;
    }
}