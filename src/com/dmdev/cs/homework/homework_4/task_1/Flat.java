package com.dmdev.cs.homework.homework_4.task_1;

public class Flat {
    private int number;
    private Room[] rooms;

    public Flat(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public void print() {
        System.out.printf("Квартира номер: %d, количество комнат: %d%n", number, rooms.length );
        for (int i = 0; i < rooms.length; i++) {
            int number = 1;
            System.out.printf("Комната номер %d %s%n", number + i, rooms[i].print());
        }
    }
}
