package com.dmdev.cs.homework.homework_6.task_2;

public class Earth extends Planet implements EarthQuakeAble {
    private final long population;

    public Earth(double mass, double radius, double distanceFromSun, Sun sun, String name, double avgTemperature, int satelliteCount, long population) {
        super(mass, radius, distanceFromSun, sun, name, avgTemperature, satelliteCount);
        this.population = population;
    }

    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public double calculateOrbitalPeriod() {
        System.out.println("считаю для земли");
        double gravity = 6.67E-11; // гравитационная постоянная

        double semiMajorAxis = getDistanceFromSun() * 1.5E11; // полуось вращения
        double timeRound = 2 * Math.PI * Math.sqrt(Math.pow(semiMajorAxis, 3) / (gravity * 1.98E30)); // период обращения в секундах

        return timeRound / (60 * 60 * 24);
    }

    @Override
    public String earthQuake(int magnitude) {
        return "Землетрясение силой в " + magnitude + " бала";
    }

    public long getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Earth{" +
                "mass = " + getMass() +
                ", radius = " + getRadius() +
                ", distanceFromSun = " + getDistanceFromSun() +
                ", surfaceArea = " + calculateSurfaceArea() +
                ", population = " + population +
                '}';
    }
}
