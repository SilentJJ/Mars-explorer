package com.codecool.marsexploration.data;

public class MapConfig {

    private String fileDirectory;
    private int xSize;
    private int numberOfMountains;
    private int numberOfPits;
    private int sizeOfShapes;

    public MapConfig(String fileDirectory, int xSize, int numberOfMountains, int numberOfPits, int sizeOfShapes) {
        this.fileDirectory = fileDirectory;
        this.xSize = xSize;
        this.numberOfMountains = numberOfMountains;
        this.numberOfPits = numberOfPits;
        this.sizeOfShapes = sizeOfShapes;
    }
}
