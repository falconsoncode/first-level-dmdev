package com.dmdev.cs.homework.homework_7.task_2;

import java.util.ArrayList;

public class Chat {
    private String name;
    private ArrayList<User>  users;

    public Chat(String name, ArrayList<User> users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
