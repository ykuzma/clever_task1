package org.example;

import java.util.List;

public class Lecturer {
    private String name;
    private List<List<StudyGroup>> listGroup;

    public Lecturer(String name, List<List<StudyGroup>> listGroup) {
        this.name = name;
        this.listGroup = listGroup;
    }

    public Lecturer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<List<StudyGroup>> getListGroup() {
        return listGroup;
    }

    public void setListGroup(List<List<StudyGroup>> listGroup) {
        this.listGroup = listGroup;
    }
}
