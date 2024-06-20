package sem_5.controller;

import sem_5.model.*;
import sem_5.service.DataService;
import sem_5.service.TrainingGroupService;
import sem_5.view.StudentView;

import java.util.List;

public class Controller {
    private final StudentView sw = new StudentView();
    private final DataService ds = new DataService();
    private final TrainingGroupService tgs = new TrainingGroupService();

    public void createStudent (String firstName, String name, String lastName) {
        ds.create(firstName, name, lastName, Type.Student);
    }

    public void createTeacher (String firstName, String name, String lastName) {
        ds.create(firstName, name, lastName, Type.Teacher);
    }

    public void createGroup (int groupId) {
        StudyGroup group = tgs.createGroup(groupId, ds.getTeacher(), ds.getAllStudent());
    }

    public void printStudents () {
        for (User user : ds.getAllStudent()) {
            sw.printOnConsole((Student)user);
        }
    }
}
