package com.dmdev.cs.homework.homework_10;

import java.util.Random;

public class CrystalMining {

    private static final int TARGET_COUNT = 500;
    private static final int MIN_CRYSTALS = 2;
    private static final int MAX_CRYSTALS = 5;

    private static int redCrystals = 0;
    private static int whiteCrystals = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread fireThread = new Thread(new FireWizard());
        Thread airThread = new Thread(new AirWizard());

        fireThread.start();
        airThread.start();

        fireThread.join();
        airThread.join();
    }

    private static synchronized void collectCrystals(int red, int white) {
        redCrystals += red;
        whiteCrystals += white;
    }

    private static synchronized boolean checkTarget() {
        return redCrystals >= TARGET_COUNT && whiteCrystals >= TARGET_COUNT;
    }

    private static class FireWizard implements Runnable {

        private final Random random = new Random();

        @Override
        public void run() {
            while (!checkTarget()) {
                try {
                    // Задержка выполнения потока до начала следующего дня
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int red = random.nextInt(MAX_CRYSTALS - MIN_CRYSTALS + 1) + MIN_CRYSTALS;
                int white = random.nextInt(MAX_CRYSTALS - MIN_CRYSTALS + 1) + MIN_CRYSTALS;

                collectCrystals(red, white);

                System.out.println("Fire Wizard collected " + red + " red crystals and " + white + " white crystals.");
                System.out.println("Fire Wizard total " + redCrystals + " red crystals and " + whiteCrystals + " white crystals.");
            }

            System.out.println("Fire Wizard has collected enough crystals and won the race!");
        }
    }

    private static class AirWizard implements Runnable {

        private final Random random = new Random();

        @Override
        public void run() {
            while (!checkTarget()) {
                try {
                    // Задержка выполнения потока до начала следующего дня
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                int red = random.nextInt(MAX_CRYSTALS - MIN_CRYSTALS + 1) + MIN_CRYSTALS;
                int white = random.nextInt(MAX_CRYSTALS - MIN_CRYSTALS + 1) + MIN_CRYSTALS;

                collectCrystals(red, white);

                System.out.println("Air Wizard collected " + red + " red crystals and " + white + " white crystals.");
                System.out.println("Air Wizard total " + redCrystals + " red crystals and " + whiteCrystals + " white crystals.");

            }

            System.out.println("Air Wizard has collected enough crystals and won the race!");
        }
    }
}

