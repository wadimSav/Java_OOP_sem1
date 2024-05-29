package sem_3;


public class StudyGroup {
    private int groupId;
    private String groupName;
    private int groupNum;

    public StudyGroup(int groupId, String groupName, int groupNum) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupNum = groupNum;
    }


    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }
}
