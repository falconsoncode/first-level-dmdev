package com.dmdev.cs.homework.homework_7.task_2;

import java.util.ArrayList;
import java.util.List;

public class ChatApplication {
    public static void main(String[] args) {
        List<Chat> chats = new ArrayList<>();
        chats.add(new Chat("Chat A", new ArrayList<>()));
        chats.get(0).getUsers().add(new User(1, "Andrey", 12));
        chats.get(0).getUsers().add(new User(2, "Masha", 14));
        chats.get(0).getUsers().add(new User(3, "Kosta", 15));
        chats.get(0).getUsers().add(new User(4, "Petr", 19));
        chats.get(0).getUsers().add(new User(5, "Yuriy", 22));

        chats.add(new Chat("Chat B", new ArrayList<>()));
        chats.get(1).getUsers().add(new User(1, "Artem", 22));
        chats.get(1).getUsers().add(new User(2, "Misha", 25));
        chats.get(1).getUsers().add(new User(3, "Nikita", 28));
        chats.get(1).getUsers().add(new User(4, "Olga", 13));
        chats.get(1).getUsers().add(new User(5, "Kirill", 12));

        chats.add(new Chat("Chat C", new ArrayList<>()));
        chats.get(2).getUsers().add(new User(1, "Marina", 35));
        chats.get(2).getUsers().add(new User(2, "Natasha", 12));
        chats.get(2).getUsers().add(new User(3, "Vlad", 15));
        chats.get(2).getUsers().add(new User(4, "Georgiy", 17));
        chats.get(2).getUsers().add(new User(5, "Goga", 12));

        System.out.println("Получим список всех пользователей кому больше 18 лет");
        List<User> users = ChatUtils.getUsersFromChats(chats);
        users.forEach(x -> System.out.println(x.getName() + ", " + x.getAge()));
        System.out.println();

        System.out.println("Получим средний возраст пользователей");
        System.out.println(ChatUtils.getAvgAge(users));
    }
}
