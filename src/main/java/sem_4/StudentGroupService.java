package sem_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public record StudentGroupService(StudentGroup studentGroup) {

    public List<Student> getSortedStudentGroup() {
        List<Student> studentList = new ArrayList<>(studentGroup.studentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentGroupByFIO() {
        List<Student> studentList = new ArrayList<>(studentGroup.studentList());
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }
}
