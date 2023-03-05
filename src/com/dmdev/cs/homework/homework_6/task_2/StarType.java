package com.dmdev.cs.homework.homework_6.task_2;

public enum StarType {

    RED_GIANT("Red"),
    WHITE_DWARF("White"),
    YELLOW_DWARF("Yellow");

    private final String color;

    private StarType(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
