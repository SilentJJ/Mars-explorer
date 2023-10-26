package com.codecool.marsexploration.logic.inputValidator;

public class MarsInputValidator implements InputValidator{

    private int availableTiles;

    @Override
    public int[] availableTileCalculator(int mapSize) {
        int[] minAndMax = new int[1];
        this.availableTiles = (int) ((mapSize * mapSize) * 0.4);
        minAndMax[0] = 10;
        minAndMax[1] = availableTiles;
        return minAndMax;
    }

    @Override
    public boolean isValid(int min, int max, int input) {
        if(input > min && input < max) {
            return true;
        }
        return false;
    }
}
