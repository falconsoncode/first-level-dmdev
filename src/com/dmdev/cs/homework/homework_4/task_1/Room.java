package com.dmdev.cs.homework.homework_4.task_1;

public class Room {
    private boolean isWalkThrough;

    public Room(boolean isWalkThrough) {
        this.isWalkThrough = isWalkThrough;
    }

    public boolean getIsWalkThrough() {
        return isWalkThrough;
    }

    public void setIsWalkThrough(boolean walkThrough) {
        isWalkThrough = walkThrough;
    }

    public String print() {
        if(isWalkThrough) {
            return "проходная";
        } else {
            return  "не проходная";
        }
    }
}
