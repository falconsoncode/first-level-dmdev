package com.dmdev.cs.homework.homework_7.task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatUtils {


    public static List<User> getUsersFromChats(List<Chat> chats) {
        if(chats.isEmpty()) {
            return Collections.emptyList();
        }

        List<User> users = new ArrayList<>();

        for (Chat chat : chats) {
            for (User user : chat.getUsers()) {
                if(user.getAge() >= 18) {
                    users.add(user);
                }
            }
        }

        return users;
    }

    public static int getAvgAge(List<User> users) {
        if (users.isEmpty()) {
            return 0;
        }

        int ageSum = 0;

        for (User user : users) {
            ageSum += user.getAge();
        }

        return  ageSum/users.size();
    }
}
