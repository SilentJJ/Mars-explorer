package com.codecool.marsexploration.ui;

import com.codecool.marsexploration.data.Map;

import java.util.Random;
import java.util.Scanner;

public class MarsExplorerUi {

    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private int mapSize = random.nextInt(15, 42);
    private Map mapGen = new Map(42);
    public void run() {

        mapGen.getMap();
        System.out.println(mapGen.getTile(3, 1));
        mapGen.setTile(3, 1, 'm');
        System.out.println(mapGen.getTile(3, 1));

        System.out.println("The map is " + mapSize + " tiles big.");

        //System.out.println("How many mountains");
        //int numberOfMountains = scanner.nextInt();
        //System.out.println("How many pits");
        //int numberOfPits = scanner.nextInt();
        //System.out.println("How big");
        //int sizeOfShapes = scanner.nextInt();

        //MapConfig mapConfig = new MapConfig("../resources", mapSize, numberOfMountains, numberOfPits, sizeOfShapes);

    }

}
