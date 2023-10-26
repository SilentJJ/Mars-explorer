package com.codecool.marsexploration.logic;

public class MarsLogic {

    private String fileDirectory;
    private int mapSize;
    private int numberOfMountains;
    private int numberOfPits;
    private int sizeOfShapes;
    public Map mapGen;
    public MarsLogic(String fileDirectory, int mapSize, int numberOfMountains, int numberOfPits, int sizeOfShapes) {
        this.fileDirectory = fileDirectory;
        this.mapSize = mapSize;
        this.numberOfMountains = numberOfMountains;
        this.numberOfPits = numberOfPits;
        this.sizeOfShapes = sizeOfShapes;
        this.mapGen = new Map(mapSize);
    }

    public void runLogic() {
        mapGen.getMap();
    }

}
