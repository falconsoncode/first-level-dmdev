package com.dmdev.cs.homework.homework_6.task_2;

public class Star extends SpaceObject {
    private String type;
    private double temperature;
    private double brightness;

    public Star(double mass, double radius, double distanceFromSun, String type, double temperature, double brightness) {
        super(mass, radius, distanceFromSun);
        this.type = type;
        this.temperature = temperature;
        this.brightness = brightness;
    }

    @Override
    public double getDiameter() {
        return super.getRadius() * 2;
    }

    public String getType() {
        return type;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getBrightness() {
        return brightness;
    }

    @Override
    public String toString() {
        return "Star{" +
                "type='" + type + '\'' +
                ", temperature=" + temperature +
                ", brightness=" + brightness +
                '}';
    }
}
