package sem_5.controller;

import sem_5.model.Student;
import sem_5.model.Type;
import sem_5.model.User;
import sem_5.service.DataService;
import sem_5.view.StudentView;

public class Controller {
    private StudentView sw = new StudentView();
    private DataService ds = new DataService();

    public void createStudent (String firstName, String name, String lastName) {
        ds.create(firstName, name, lastName, Type.Student);
    }

    public void printStudents () {
        for (User user : ds.getAllStudent()) {
            sw.printOnConsole((Student)user);
        }
    }
}
