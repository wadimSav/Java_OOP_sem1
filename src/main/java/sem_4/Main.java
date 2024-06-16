package sem_4;

public class Main {
    public static void main(String[] args) {
//        StudentController controller = new StudentController();
//        controller.create("1", "2", "3");
//        controller.create("2", "4", "6");
//        controller.create("3", "6", "9");
//        controller.create("4", "8", "12");
//        controller.printStudentList();

        TeacherController controller = new TeacherController();
        controller.create("1", "2", "3");
        controller.create("2", "4", "6");
        controller.create("3", "6", "9");
        controller.create("4", "8", "12");

        controller.editTeacher("Пупкин", "Василий", "Петрович", 2);

        controller.printTeachers();
    }
}
