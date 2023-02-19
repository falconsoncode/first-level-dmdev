package com.dmdev.cs.homework.homework_4.task_1;

/**
 * Представить в виде классов и их композиции следующую модель.
 * <p>
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * <p>
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * <p>
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * <p>
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * <p>
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * <p>
 * Например, метод print класса этаж должен выводить на консоль:
 * <p>
 * “Этаж 2, количество квартир 18”
 * <p>
 * Создание всех объектов вынести в отдельный класс с методом main.
 * <p>
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */

public class BuildingInformation {
    public static void main(String[] args) {

        Room[] rooms = {new Room(true), new Room(false)};
        Flat[] flats = {new Flat(1, rooms), new Flat(2, rooms)};
        Floor[] floors = {new Floor(1, flats), new Floor(2, flats)};
        Apartment apartment = new Apartment(1, floors);

        //Проверяем методы print каждого класса
        apartment.print();
        for (Floor floor : floors) {
            floor.print();
        }
        for (Flat flat : flats) {
            flat.print();
        }
        for (Room room : rooms) {
            room.print();
        }

        // проверяем метод printAllInformation
        printAllInformation(apartment);

    }

    private static void printAllInformation(Apartment apartment) {
        System.out.println();
        System.out.println("Full information");
        apartment.print();
        for (Floor floor : apartment.getFloors()) {
            floor.print();
            for (Flat flat : floor.getFlats()) {
                flat.print();
                for (Room room : flat.getRooms()) {
                    room.print();
                }
            }
        }
    }
}
