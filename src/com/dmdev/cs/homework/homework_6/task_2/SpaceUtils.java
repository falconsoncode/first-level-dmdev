package com.dmdev.cs.homework.homework_6.task_2;

public final class SpaceUtils {

    private SpaceUtils() {
    }

    public static double calculateForce(SpaceObject obj1, SpaceObject obj2) {

        final double G = 6.67430e-11;
        double distance = Math.abs(obj1.getDistanceFromSun() - obj2.getDistanceFromSun());

        return G * obj1.getMass() * obj2.getMass() / Math.pow(distance, 2);
    }

    public static boolean isStar(SpaceObject obj) {
        return obj instanceof Star;
    }

}