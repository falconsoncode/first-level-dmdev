package com.dmdev.cs.homework.homework_6.task_2;

public abstract class SpaceObject {

    private double mass;
    private double radius;
    private double distanceFromSun;

    public SpaceObject(double mass, double radius, double distanceFromSun) {
        this.mass = mass;
        this.radius = radius;
        this.distanceFromSun = distanceFromSun;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    public abstract double getDiameter();

    public int compareMass(SpaceObject obj) {
        return Double.compare(this.getMass(), obj.getMass());
    }

    @Override
    public abstract String toString();
}
