package org.example;

import java.util.List;

public class Lecturer {
    private String name;
    private List<List<StudyGroup>> listGroup;

    public Lecturer(String name, List<List<StudyGroup>> listGroup) {
        this.name = name;
        this.listGroup = listGroup;
    }
}
