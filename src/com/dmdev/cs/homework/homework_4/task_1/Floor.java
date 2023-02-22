package com.dmdev.cs.homework.homework_4.task_1;

public class Floor {
    private int number;
    private Flat[] flats;

    public Floor(int number, Flat[] flats) {
        this.number = number;
        this.flats = flats;
    }

    public void print() {
        System.out.printf("Этаж: %d, количесвто квартир: %d%n", number, flats.length);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }
}
