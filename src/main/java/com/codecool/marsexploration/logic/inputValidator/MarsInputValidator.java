package com.codecool.marsexploration.logic.inputValidator;

public class MarsInputValidator implements InputValidator{

    private int availableTiles;

    @Override
    public int availableTileCalculator() {
        return (int) Math.floor(availableTiles * 0.35);
    }

    @Override
    public void usedTiles(int num) {
        availableTiles -= num;
    }

    @Override
    public void setAvaliableTiles(int num) {
        availableTiles = num * num;
    }

    @Override
    public boolean isValid(int min, int max, int input) {
        return input >= min && input <= max;
    }
}
