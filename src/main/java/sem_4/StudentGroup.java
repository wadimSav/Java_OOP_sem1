package sem_4;

// Класс соответствует следующим принципам SOLID:
// 1) Single Responsibility Principle. Принцип единственной ответственности.
// 2) Interface Segregation Principle. Принцип разделения интерфейса.

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
