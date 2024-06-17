package sem_5.model;

public class Student extends User{
    private final int studentId;

    public int getStudentId() {
        return studentId;
    }

    public Student(String firstName, String name, String lastName, int studentId) {
        super(firstName, name, lastName);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId = " + studentId + " " +
                super.toString() +
                '}';
    }
}
