package sem_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudyGroup group = new StudyGroup(1, "Nauka", 3);
        StudyGroup group1 = new StudyGroup(2, "Nauka4", 8);
        StudyGroup group2 = new StudyGroup(1, "Naukasfdg", 5);
        StudyGroup group3 = new StudyGroup(2, "Nauka4asa", 8);
        StudyGroup group4 = new StudyGroup(2, "Nauka4asasdf", 9);
        StudyGroup group5 = new StudyGroup(2, "Nauka4", 8);
        StudyGroup group6 = new StudyGroup(1, "Naukasfdg", 5);
        StudyGroup group7 = new StudyGroup(2, "Nauka4asa", 8);
        StudyGroup group8 = new StudyGroup(2, "Nauka4asasdf", 9);

        List<StudyGroup> studyList = new ArrayList<>();
        List<StudyGroup> studyList2 = new ArrayList<>();
        List<Stream> streamList = new ArrayList<>();

        Stream stream1 = new Stream(studyList);
        Stream stream2 = new Stream(studyList2);

        stream1.addStudyGroup(group);
        stream1.addStudyGroup(group1);
        stream1.addStudyGroup(group4);

        stream2.addStudyGroup(group2);
        stream2.addStudyGroup(group3);
        stream2.addStudyGroup(group5);
        stream2.addStudyGroup(group6);
        stream2.addStudyGroup(group7);
        stream2.addStudyGroup(group8);

        streamList.add(stream2);
        streamList.add(stream1);

        StreamService service = new StreamService(streamList);

        System.out.println(service);
        for (Stream stream : service.getSortedStreamList()) {
            System.out.println(stream);
        }
    }
}
