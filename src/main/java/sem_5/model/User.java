package sem_5.model;

public abstract class User {
    private String firstName;
    private String name;
    private String lastName;

    public User(String firstName, String name, String lastName) {
        this.firstName = firstName;
        this.name = name;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName = '" + firstName + '\'' +
                ", name = '" + name + '\'' +
                ", lastName = '" + lastName + '\'' +
                '}';
    }
}
