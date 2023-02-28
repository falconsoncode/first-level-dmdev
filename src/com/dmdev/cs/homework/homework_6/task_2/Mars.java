package com.dmdev.cs.homework.homework_6.task_2;

public class Mars extends Planet {

    public Mars(double mass, double radius, double distanceFromSun, Sun sun, String name, double avgTemperature, int satelliteCount) {
        super(mass, radius, distanceFromSun, sun, name, avgTemperature, satelliteCount);
    }

    @Override
    public double calculateOrbitalPeriod() {
        double gravity = 6.67E-11;

        double semiMajorAxis = getDistanceFromSun() * 1.5E11;
        double timeRound = 2 * Math.PI * Math.sqrt(Math.pow(semiMajorAxis, 3) / (gravity * 1.98E30));

        return timeRound / (60 * 60 * 24);
    }

    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "Mars{" +
                "mass = " + getMass() +
                ", radius = " + getRadius() +
                ", distanceFromSun = " + getDistanceFromSun() +
                ", surfaceArea = " + calculateSurfaceArea() +
                '}';
    }
}
