package com.company;

class House {
    String address;
    int floor;
    int kol_room;
    double square;

    public House(String address, int floor, int kol_room, double square) {
        this.address = address;
        this.floor = floor;
        this.kol_room = kol_room;
        this.square = square;
    }

    @Override
    public String toString() {
        return "адрес: " + address + ", этаж: " + floor + ", количество комнат: " + kol_room + ", площадь: " + square;
    }
}

public class Main {
    public static void main(String[] args) {
        House[] info = {
                new House("ул. Ленина, 1", 2, 3, 75.0),
                new House("ул. Пушкина, 5", 3, 2, 60.0),
                new House("ул. Гоголя, 10", 1, 3, 80.0),
                new House("ул. Чехова, 7", 2, 1, 65.0),
                new House("ул. Толстого, 2", 3, 5, 85.0)
        };

        int needrooms = 3;
        System.out.println("Список квартир с " + needrooms + " комнатами:");
        for (House house : info) {
            if (house.kol_room == needrooms) {
                System.out.println(house);
            }
        }

        int needfloor = 2;
        System.out.println("\nСписок квартир с " + needrooms + " комнатами на " + needfloor + " этаже:");
        for (House house : info) {
            if (house.kol_room == needrooms && house.floor == needfloor) {
                System.out.println(house);
            }
        }
        double needsquare = 70.0;
        System.out.println("\nСписок квартир с площадью превосходящей " + needsquare + ":");
        for (House house : info) {
            if (house.square > needsquare) {
                System.out.println(house);
            }
        }
    }
}

