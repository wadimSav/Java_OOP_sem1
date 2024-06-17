package sem_5.service;

import sem_5.model.Teacher;
import sem_5.model.Type;
import sem_5.model.User;
import sem_5.model.Student;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private final List<User> listUsers = new ArrayList<>();

    public List<User> getListUsers() {
        return listUsers;
    }

    public void create (String firstName, String name, String lastName, Type type) {
        int id = this.getId(type);
        if (Type.Student == type) {
            Student student = new Student(firstName, name, lastName, id);
            listUsers.add(student);
        }
        if (Type.Teacher == type) {
            Teacher teacher = new Teacher(firstName, name, lastName, id);
            listUsers.add(teacher);
        }
    }

    private int getId(Type type) {
        int id = 0;
        for (User user : listUsers) {
            if (user instanceof Teacher && Type.Teacher == type) {
                id = ((Teacher) user).getTeacherId();
            }
            if (user instanceof Student && Type.Student == type) {
                id = ((Student) user).getStudentId();
            }
        }
        return ++id;
    }

    public List<User> getAllStudent () {
        List<User> listUser = new ArrayList<>();
        for (User user : listUsers) {
            if (user instanceof Student) {
                listUser.add(user);
            }
        }
        return listUser;
    }
}
