package com.dmdev.cs.homework.homework_6.task_2;

public class Sun extends Star implements YellowDwarf {
    private boolean hasCoronalMassEjections;
    private double age;

    public Sun(double mass, double radius, double distanceFromSun, String type, double temperature, double brightness, boolean hasCoronalMassEjections, double age) {
        super(mass, radius, distanceFromSun, type, temperature, brightness);
        this.hasCoronalMassEjections = hasCoronalMassEjections;
        this.age = age;
    }

    @Override
    public double getAge() {
        return age;
    }

    public boolean isHasCoronalMassEjections() {
        return hasCoronalMassEjections;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "hasCoronalMassEjections = " + hasCoronalMassEjections +
                ", age = " + age +
                '}';
    }
}
