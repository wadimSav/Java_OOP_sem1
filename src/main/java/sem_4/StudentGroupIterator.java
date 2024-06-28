package sem_4;

// Класс соответствует следующим принципам SOLID:
// 1) Single Responsibility Principle. Принцип единственной ответственности.
// 2) Liskov Substitution Principle. Принцип подстановки Барбары Лисков.
// 3) Interface Segregation Principle. Принцип разделения интерфейса.

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private final List<Student> studentList;
    private int counter;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.studentList();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studentList.size();
    }

    @Override
    public Student next() {
        if(hasNext()){
            return studentList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext())
            studentList.remove(counter);
    }
}
