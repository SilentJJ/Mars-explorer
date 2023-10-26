package com.codecool.marsexploration.logic.inputValidator;

public interface InputValidator {
    int[] availableTileCalculator(int mapSize);
    boolean isValid(int min, int max, int input);
}
