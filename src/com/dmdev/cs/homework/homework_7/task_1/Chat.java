package com.dmdev.cs.homework.homework_7.task_1;

public class Chat {
    private String name;
    private Integer membersCount;

    public Chat(String name, Integer membersCount) {
        this.name = name;
        this.membersCount = membersCount;
    }

    public String getName() {
        return name;
    }

    public Integer getMembersCount() {
        return membersCount;
    }
}
