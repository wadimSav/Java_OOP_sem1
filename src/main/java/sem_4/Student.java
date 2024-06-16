package sem_4;

public class Student extends User implements Comparable<Student>{
    private int studentId;


    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }



    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId + " " +
                super.toString() +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(studentId, o.getStudentId());
    }
}
