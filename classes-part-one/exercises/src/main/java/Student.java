public class Student {

    private static int nextStudentId = 1;
    private static String name;
    private static int studentId;
    private int numberOfCredits;
    private static double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public static String studentInfo() {
        return (name + " has student ID " + studentId + " and a GPA of: " + gpa);
    }

    public void addGrade(int courseCredits, double grade) {

        // Update the appropriate fields: numberOfCredits, gpa
       // return
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        String gradeLevel;

        if (numberOfCredits >= 90) {
            gradeLevel = "senior";
        } else if (numberOfCredits >= 60) {
            gradeLevel = "junior";
        } else if (numberOfCredits >= 30) {
            gradeLevel = "sophomore";
        } else {
            gradeLevel = "freshman";
        }
        return gradeLevel;
    }

    /* getters and setters omitted */

}
