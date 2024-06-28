package sem_4;

// Класс соответствует следующим принципам SOLID:
// 1) Single Responsibility Principle. Принцип единственной ответственности.
// 2) Interface Segregation Principle. Принцип разделения интерфейса.

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSecondName().compareTo(o2.getSecondName());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultOfComparing == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}
