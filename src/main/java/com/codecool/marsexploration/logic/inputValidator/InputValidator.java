package com.codecool.marsexploration.logic.inputValidator;

public interface InputValidator {
    int availableTileCalculator();
    boolean isValid(int min, int max, int input);
    void usedTiles(int num);
    void setAvaliableTiles(int num);
}
