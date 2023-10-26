package com.codecool.marsexploration.logic;

import com.codecool.marsexploration.TileGenerator.GenerateResource.MineralGenerator;
import com.codecool.marsexploration.TileGenerator.GenerateResource.WaterGenerator;
import com.codecool.marsexploration.TileGenerator.GenerateShapes.MountainGenerator;
import com.codecool.marsexploration.TileGenerator.GenerateShapes.PitGenerator;
import com.codecool.marsexploration.TileGenerator.TileGenerator;
import com.codecool.marsexploration.TileGenerator.TileValidator;

public class MarsLogic {

    private final TileValidator validator= new TileValidator();
    private String fileDirectory;
    private int mapSize;
    private int numberOfMountains;
    private int numberOfPits;
    public Map mapGen;
    public MarsLogic(String fileDirectory, int mapSize, int numberOfMountains, int numberOfPits) {
        this.fileDirectory = fileDirectory;
        this.mapSize = mapSize;
        this.numberOfMountains = numberOfMountains;
        this.numberOfPits = numberOfPits;
        this.mapGen = new Map(mapSize);
    }

    public void runLogic() {
        TileGenerator mountainGen = new MountainGenerator(validator);
        TileGenerator pitGen = new PitGenerator(validator);
        TileGenerator mineralGen = new MineralGenerator(validator);
        TileGenerator waterGen = new WaterGenerator(validator);
        mountainGen.generateTiles(mapGen, numberOfMountains);
        pitGen.generateTiles(mapGen, numberOfPits);
        int numberOfMinerals = (int) Math.floor(numberOfMountains * 0.4);
        mineralGen.generateTiles(mapGen, numberOfMinerals);
        int numberOfWater = (int) Math.floor(numberOfPits * 0.4);
        waterGen.generateTiles(mapGen, numberOfWater);
        char[][] map = mapGen.getMap();
        for(char[] mapX : map) {
            System.out.println(mapX);
        }
    }

}
