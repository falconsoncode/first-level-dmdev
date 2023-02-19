package com.dmdev.cs.homework.homework_4.task_1;

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
