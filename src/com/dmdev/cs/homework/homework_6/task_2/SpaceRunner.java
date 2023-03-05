package com.dmdev.cs.homework.homework_6.task_2;

public class SpaceRunner {

    public static void main(String[] args) {

        Sun sun = new Sun(1.989E30, 696_340, 0, StarType.YELLOW_DWARF.getColor(), 5778, 3.846E26, true, 4.603E9);
        Planet earth = new Earth(5.972E24, 6371, 14815E11, sun, "Earth", 16.0, 1, 7_888_000_000L);
        Planet mars = new Mars(6.39E2, 3389.5, 244_410_000, sun, "Mars", 287.2, 2);

        YellowDwarf yellowDwarf = sun;
        EarthQuakeAble earthQuakeAble = (Earth) earth;

        //период обращения планет (рассчет неверный)
        getOrbitalPeriod(earth, mars);

        //to string
        System.out.println(earth);
        System.out.println(mars);
        System.out.println(sun);

        //сравнение масс
        System.out.println("Сравение масс:");
        System.out.println(earth.compareMass(mars));
        System.out.println(earth.compareMass(sun));
        System.out.println(earth.compareMass(earth));

        //SpaceUtil
        System.out.println(SpaceUtils.calculateForce(mars, earth));
        System.out.println(SpaceUtils.isStar(sun));
        System.out.println(SpaceUtils.isStar(earth));

        //методы интерфейсов
        System.out.println(yellowDwarf.getAge());
        System.out.println(earthQuakeAble.earthQuake(6));

    }

    public static void getOrbitalPeriod(Planet... planets) {
        for (Planet planet : planets) {
            System.out.printf("Период обращения планеты %s вокруг солнца составляет %f дней%n", planet.getName(), planet.calculateOrbitalPeriod());
        }
    }
}
