package com.dmdev.cs.homework.homework_7.task_1;

import java.util.ArrayList;
import java.util.List;

public class ChatApplication {
    public static void main(String[] args) {
        List<Chat> chatList = new ArrayList<>();
        chatList.add(new Chat("Third Chat", 700));
        chatList.add(new Chat("Fourth Chat", 800));
        chatList.add(new Chat("Fifth Chat", 900));
        chatList.add(new Chat("Sixth Chat", 1000));
        chatList.add(new Chat("Seventh Chat", 2000));
        chatList.add(new Chat("Eighth Chat", 3000));
        chatList.add(new Chat("Ninth Chat", 4000));
        chatList.add(new Chat("Tenth Chat", 1000));
        chatList.add(new Chat("Eleventh Chat", 1000));
        chatList.add(new Chat("Twelfth Chat", 3000));
        chatList.add(new Chat("Thirteenth Chat", 2000));

        List<Chat> chatList2 = new ArrayList<>(chatList);

        System.out.println("Удаляем чаты, где участников меньше 1000");
        ChatUtils.removeIfLessThenTen(chatList);
        chatList.forEach(x -> System.out.println(x.getName() + ", " + x.getMembersCount()));
        System.out.println();

        System.out.println("Сортируем по убыванию и имени");
        ChatUtils.sortByMembersCountDescending(chatList);
        chatList.forEach(x -> System.out.println(x.getName() + ", " + x.getMembersCount()));
        System.out.println();

        System.out.println("Сортируем по имени");
        ChatUtils.sortByName(chatList2);
        chatList2.forEach(x -> System.out.println(x.getName() + ", " + x.getMembersCount()));

    }
}
