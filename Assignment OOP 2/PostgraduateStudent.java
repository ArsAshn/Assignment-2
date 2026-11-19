/** Derived class 2: adds research title and supervisor. */
public class PostgraduateStudent extends Student {

    private String researchTitle;
    private String supervisor;

    public PostgraduateStudent(String studentId, String name, int age, String email,
                               String programme, int creditHours, double feePerCreditHour,
                               String researchTitle, String supervisor) {
        super(studentId, name, age, email, programme, creditHours, feePerCreditHour);
        this.researchTitle = researchTitle;
        this.supervisor = supervisor;
    }

    public String getResearchTitle() { return researchTitle; }
    public String getSupervisor()    { return supervisor; }
    public void setResearchTitle(String researchTitle) { this.researchTitle = researchTitle; }
    public void setSupervisor(String supervisor)       { this.supervisor = supervisor; }

    /** Polymorphism: adds a flat RM1500 research fee. */
    @Override
    public double calculateTuitionFee() {
        return super.calculateTuitionFee() + 1500;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " | Postgraduate, Research: " + researchTitle
                + ", Supervisor: " + supervisor;
    }
}