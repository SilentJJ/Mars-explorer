package com.codecool.marsexploration.logic;

import com.codecool.marsexploration.logic.fileWriter.FileWriter;
import com.codecool.marsexploration.logic.fileWriter.MapFileWriter;

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
        System.out.println(mapGen.getTile(3, 1));
        mapGen.setTile(3, 1, 'm');
        System.out.println(mapGen.getTile(3, 1));
        FileWriter fileWriter = new MapFileWriter(mapGen);
        fileWriter.writeMapToFile();
    }

}
