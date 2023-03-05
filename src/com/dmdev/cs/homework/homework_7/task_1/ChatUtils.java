package com.dmdev.cs.homework.homework_7.task_1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ChatUtils {

    public static void removeIfLessThenTen(List<Chat> chats) {
        if (chats.isEmpty()) {
            return;
        }

        Iterator<Chat> chatIterator = chats.iterator();

        while (chatIterator.hasNext()) {
            Chat chat = chatIterator.next();
            if (chat.getMembersCount() < 1000) {
                chatIterator.remove();
            }
        }
    }

    public static void sortByMembersCountDescending(List<Chat> chatList) {
        chatList.sort(new Comparator<Chat>() {
            @Override
            public int compare(Chat chat1, Chat chat2) {
                int membersCountComparison = chat2.getMembersCount().compareTo(chat1.getMembersCount());
                if (membersCountComparison != 0) {
                    return membersCountComparison;
                } else {
                    return chat1.getName().compareTo(chat2.getName());
                }
            }
        });
    }

    public static void sortByName(List<Chat> chatList) {
        chatList.sort(new Comparator<Chat>() {
            @Override
            public int compare(Chat chat1, Chat chat2) {
                return chat1.getName().compareTo(chat2.getName());
            }
        });
    }
}
