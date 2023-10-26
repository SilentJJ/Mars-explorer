package com.codecool.marsexploration.ui;

import com.codecool.marsexploration.logic.Map;
import com.codecool.marsexploration.logic.MarsLogic;

import java.util.Random;
import java.util.Scanner;

public class MarsExplorerUi {

    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("How big should the map be?");
        int mapSize = scanner.nextInt();
        System.out.println("How many mountains");
        int numberOfMountains = scanner.nextInt();
        System.out.println("How many pits");
        int numberOfPits = scanner.nextInt();
        System.out.println("How big");
        int sizeOfShapes = scanner.nextInt();
        System.out.println("The map is " + mapSize + " tiles big.");

        MarsLogic marsLogic = new MarsLogic("../resources", mapSize, numberOfMountains, numberOfPits, sizeOfShapes);


        marsLogic.runLogic();

    }

}
