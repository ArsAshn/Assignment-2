public class Main {

    public static void main(String[] args) {

        // Create students: different derived types stored as the base type
        Student[] students = {
            new UndergraduateStudent("S001", "Ali", 20, "ali@gmail.com",
                    "Computer Science", 15, 300, 3.60, 3),
            new UndergraduateStudent("S002", "Siti", 19, "siti@gmail.com",
                    "Cybersecurity", 15, 300, 2.80, 2),
            new PostgraduateStudent("S003", "Wei Ming", 25, "weiming@gmail.com",
                    "Computer Science", 9, 450, "AI in Healthcare", "Dr. Lim")
        };

        // Create other objects
        Course c1 = new Course("CCS20704", "Object Oriented Programming", 3);
        Course c2 = new Course("CCS20103", "Cybersecurity Fundamentals", 3);
        Department d1 = new Department("Department of Computing", "DOC01",
                "Faculty of Information Sciences");

        Enrollment e1 = new Enrollment(students[0], c1, "September 2026");
        Enrollment e2 = new Enrollment(students[1], c2, "September 2026");
        Enrollment e3 = new Enrollment(students[2], c1, "September 2026");

        System.out.println("===== DEPARTMENT INFORMATION =====");
        d1.displayDepartment();

        System.out.println("\n===== COURSE INFORMATION =====");
        c1.displayCourse();
        System.out.println();
        c2.displayCourse();

        // Loop + polymorphism: same call, different result per student type
        System.out.println("\n===== STUDENT INFORMATION =====");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("\nStudent " + (i + 1));
            System.out.println(s.getDetails());
            System.out.println("Tuition fee: RM" + s.calculateTuitionFee());

            // if-else: undergraduates have CGPA, postgraduates do not
            if (s instanceof UndergraduateStudent) {
                UndergraduateStudent u = (UndergraduateStudent) s;
                System.out.println("Academic Status: " + u.getAcademicStatus());
                if (u.isSeniorStudent()) {
                    System.out.println("Year Status: Senior Student");
                } else {
                    System.out.println("Year Status: Junior Student");
                }
            } else {
                System.out.println("Postgraduate student (no CGPA status)");
            }
        }

        System.out.println("\n===== ENROLLMENT INFORMATION =====");
        e1.displayEnrollment();
        System.out.println();
        e2.displayEnrollment();
        System.out.println();
        e3.displayEnrollment();

        // while loop: total expected tuition collected
        double totalFees = 0;
        int index = 0;
        while (index < students.length) {
            totalFees += students[index].calculateTuitionFee();
            index++;
        }
        System.out.println("\nTotal tuition fees: RM" + totalFees);

        // Setter/getter and validation demo
        System.out.println("\n===== UPDATE STUDENT INFORMATION =====");
        students[0].setEmail("ali2026@gmail.com");
        System.out.println("Updated Email: " + students[0].getEmail());
        students[1].setCreditHours(-3); // triggers validation message
    }
}