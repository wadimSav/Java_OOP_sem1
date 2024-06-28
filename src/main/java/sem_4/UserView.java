package sem_4;

// Класс соответствует следующим принципам SOLID:
// 1) Single Responsibility Principle. Принцип единственной ответственности.

import java.util.List;

public class UserView<T extends User> {
    void sendOnConsole(List<T> users) {
        for (T user : users)
            System.out.println(user);
    }
}
