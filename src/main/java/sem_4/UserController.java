package sem_4;

// Класс соответствует следующим принципам SOLID:
// 1) Single Responsibility Principle. Принцип единственной ответственности.
// 2) Interface Segregation Principle. Принцип разделения интерфейса.

public interface UserController <T extends User> {
    void create(String firstName, String secondName, String lastName);
}
