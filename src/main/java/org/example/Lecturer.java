package org.example;

import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecturer lecturer = (Lecturer) o;
        return Objects.equals(name, lecturer.name) && Objects.equals(listGroup, lecturer.listGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, listGroup);
    }
}
