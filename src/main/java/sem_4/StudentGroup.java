package sem_4;

import java.util.Iterator;
import java.util.List;

public record StudentGroup(List<Student> studentList) implements Iterable<Student> {

    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
