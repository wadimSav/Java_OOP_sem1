package sem_5.model;

import java.util.List;

public class StudyGroup {
    private int groupId;
    private Teacher teacher;
    private List<User> studentList;

    public StudyGroup(int groupId, Teacher teacher, List<User> studentList) {
        this.groupId = groupId;
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<User> getStudentList() {
        return studentList;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudentList(List<User> studentList) {
        this.studentList = studentList;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "groupId=" + groupId +
                ", teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }
}
