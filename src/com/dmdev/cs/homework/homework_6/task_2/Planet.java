package com.dmdev.cs.homework.homework_6.task_2;

public class Planet extends SpaceObject{

    private final Sun sun;
    private String name;
    private double avgTemperature;
    private int satelliteCount;

    public Planet(double mass, double radius, double distanceFromSun, Sun sun, String name, double avgTemperature, int satelliteCount) {
        super(mass, radius, distanceFromSun);
        this.sun = sun;
        this.name = name;
        this.avgTemperature = avgTemperature;
        this.satelliteCount = satelliteCount;
    }

    @Override
    public double getDiameter() {
        return getRadius() * 2;
    }

    public double calculateOrbitalPeriod() {
        double gravity = 6.67E-11; // гравитационная постоянная

        double semiMajorAxis = getDistanceFromSun() * 1.5E11;
        double timeRound = 2 * Math.PI * Math.sqrt(Math.pow(semiMajorAxis, 3) / (gravity * 1.98E30)); // период обращения в секундах

        return timeRound / (60 * 60 * 24); // период обращения в днях
    }

    public String getName() {
        return name;
    }

    public double getAvgTemperature() {
        return avgTemperature;
    }

    public int getSatelliteCount() {
        return satelliteCount;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", avgTemperature=" + avgTemperature +
                ", satelliteCount=" + satelliteCount +
                '}';
    }
}
