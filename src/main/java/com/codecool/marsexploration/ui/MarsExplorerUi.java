package com.codecool.marsexploration.ui;

import com.codecool.marsexploration.logic.Map;
import com.codecool.marsexploration.logic.MarsLogic;
import com.codecool.marsexploration.logic.inputValidator.InputValidator;
import com.codecool.marsexploration.logic.inputValidator.MarsInputValidator;

import java.util.Random;
import java.util.Scanner;

public class MarsExplorerUi {

    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private int minimumMapSize = 10;
    private int maximumMapSize = 100;
    private int minAvailableTiles;
    private int maxAvailableTiles;
    private InputValidator inputValidator = new MarsInputValidator();
    public void run() {

        int mapSize = askUserInput(minimumMapSize, maximumMapSize, "tiles");

        int userMountainsInput = askUserInput(minAvailableTiles, maxAvailableTiles, "mountain tiles");

        int userPitsInput = askUserInput(minAvailableTiles, maxAvailableTiles, "pit tiles");

        System.out.println("The map is " + mapSize + " tiles big.");

        MarsLogic marsLogic = new MarsLogic("../resources", mapSize, userMountainsInput, userPitsInput);

        marsLogic.runLogic();

    }

    private int askUserInput(int min, int max, String tileToChange) {
        System.out.println("How many " + tileToChange + "?" + "\nMin: " + min + "\nMax: " + max);
        int checkedInput = scanner.nextInt();
        while (!inputValidator.isValid(min, max, checkedInput)){
            System.out.println("Invalid\nMin: " + min + "\nMax: " + max);
            checkedInput = scanner.nextInt();
        }
        int[] minAndMax = inputValidator.availableTileCalculator(checkedInput);
        minAvailableTiles = minAndMax[0];
        maxAvailableTiles = minAndMax[1];
        return checkedInput;
    }

}
