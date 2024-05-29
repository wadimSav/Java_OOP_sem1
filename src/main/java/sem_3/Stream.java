package sem_3;

import java.util.Iterator;
import java.util.List;

public record Stream(List<StudyGroup> studyGroupList) implements Iterator<StudyGroup> {
    public void addStudyGroup(StudyGroup studyGroup) {
        studyGroupList.add(studyGroup);
    }
    public static int count;

    @Override
    public boolean hasNext() {
        return count < studyGroupList.size();
    }

    @Override
    public StudyGroup next() {
        if(hasNext()) {
            return studyGroupList.get(count++);
        }
        return null;
    }
}
