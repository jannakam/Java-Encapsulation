//for testing

public class Main {
    public static void main(String[] args) {
        Student newStudent = new Student("John", 21, 3.2);
        System.out.println(newStudent);
        String gpaStatus = newStudent.getGpaStatus();
        // print gpa status
        System.out.println(gpaStatus);
    }
}