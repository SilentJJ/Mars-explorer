package com.codecool.marsexploration.TileGenerator;

import com.codecool.marsexploration.logic.Map;

import java.util.Random;

public abstract class TileGenerator {

    protected final char tileChar;
    protected final TileValidator validator;
    protected final Random random = new Random();

    public TileGenerator(char tileChar, TileValidator validator) {
        this.tileChar = tileChar;
        this.validator = validator;
    }

    public abstract void generateTiles(Map map, int howManyTiles);

    public void placeTilesNextToShapes(char shapeToPlaceNextTo, Map map, int howManyTilesIsNeeded) {
        int mapSize = map.getMapSize();
        int tileCount = 0;
        while(tileCount < howManyTilesIsNeeded) {
            int randomX = random.nextInt(mapSize - 1);
            int randomY = random.nextInt(mapSize - 1);
            boolean placeable = validator.neighborIsValid(randomX, randomY, shapeToPlaceNextTo, map);
            if(placeable) {
                map.setTile(randomX, randomY, tileChar);
                tileCount++;
            }
        }
    }
}
