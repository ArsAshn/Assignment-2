/** Common interface: each type of student calculates fees in its own way. */
public interface Billable {
    double calculateTuitionFee();
    String getDetails();
}