package sem_5;

import sem_5.controller.Controller;

public class Program {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Пупкин", "Вася", "Батькович");
        controller.createStudent("Лапкин", "Коля", "Бабушкин");
        controller.createStudent("Васечкин", "Алекс", "Самойлович");
        controller.createStudent("Гламуркин", "Петя", "Петрович");
        controller.createTeacher("Глам", "Петяh", "Петрsdfg");

        controller.createGroup(1);

//        controller.printStudents();
    }
}
