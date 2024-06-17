package sem_5.model;

public class Teacher extends User{
    private final int teacherId;

    public int getTeacherId() {
        return teacherId;
    }

    public Teacher(String firstName, String name, String lastName, int teacherId) {
        super(firstName, name, lastName);
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId + " " +
                super.toString() +
                '}';
    }
}
