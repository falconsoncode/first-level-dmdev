package com.dmdev.cs.homework.homework_4.task_1;

public class Apartment {
    private int number;
    private Floor[] floors;

    public Apartment(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public void print() {
        System.out.printf("Номер дома: %d, количество этажей: %d%n", number, floors.length);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }
}
