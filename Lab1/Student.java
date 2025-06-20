public class Student {
    // Private member variables
    private String studentName;
    private String collegeName;
    private int studentID;

    public static void main(String[] args) {
        Student s = new Student();
        s.studentID = 1;
        System.out.println("Student ID: " + s.studentID);
        s.studentName = "Prathmesh";
        System.out.println("Student Name: " + s.studentName);
        s.collegeName = "DYP College";
        System.out.println("College Name: " + s.collegeName);
        System.out.println("Successful");
    }
}
