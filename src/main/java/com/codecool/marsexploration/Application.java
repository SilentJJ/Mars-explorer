package com.codecool.marsexploration;

import com.codecool.marsexploration.data.MapConfig;
import com.codecool.marsexploration.data.MapGen;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int mapSize = random.nextInt(42);
        MapGen mapGen = new MapGen(42);

        System.out.println("The map is " + mapSize + "tiles big.");

        System.out.println("How many mountains");
        int numberOfMountains = scanner.nextInt();
        System.out.println("How many pits");
        int numberOfPits = scanner.nextInt();
        System.out.println("How big");
        int sizeOfShapes = scanner.nextInt();

        MapConfig mapConfig = new MapConfig("../resources", mapSize, numberOfMountains, numberOfPits, sizeOfShapes);
    }
}
