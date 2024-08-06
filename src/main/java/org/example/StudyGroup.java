package org.example;

import java.util.List;

public class StudyGroup {
    private List<User> userList;

    public StudyGroup(List<User> userList) {
        this.userList = userList;
    }

    public StudyGroup() {
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
