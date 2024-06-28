package sem_4;

// Класс соответствует следующим принципам SOLID:
// 1) Single Responsibility Principle. Принцип единственной ответственности.
// 2) Liskov Substitution Principle. Принцип подстановки Барбары Лисков.
// 3) Interface Segregation Principle. Принцип разделения интерфейса.

import java.util.ArrayList;

public class StudentController implements UserController<Student>{
    StudentGroup students = new StudentGroup(new ArrayList<>());
    UserView<Student> userView = new UserView<Student>();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        if(!students.studentList().isEmpty())
            maxId = students.studentList().getLast().getStudentId() + 1;
        Student student = new Student(maxId, firstName, secondName, lastName);
        students.addStudent(student);
    }

    void printStudentList() {
        userView.sendOnConsole(students.studentList());
    }
}
