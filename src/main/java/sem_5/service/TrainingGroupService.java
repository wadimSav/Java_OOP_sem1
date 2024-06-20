package sem_5.service;

import sem_5.model.StudyGroup;
import sem_5.model.Teacher;
import sem_5.model.User;

import java.util.List;

public class TrainingGroupService {
    public StudyGroup createGroup(int groupId, Teacher teacher, List<User> studentList) {
        return new StudyGroup(groupId, teacher, studentList);
    }
}
