package com.codecool.marsexploration.TileGenerator;

import com.codecool.marsexploration.logic.Map;

import java.util.Random;

public abstract class TileGenerator {

    protected final char tileChar;
    protected final TileValidator validator;
    protected static final Random random = new Random();

    public TileGenerator(char tileChar, TileValidator validator) {
        this.tileChar = tileChar;
        this.validator = validator;
    }

    public abstract void generateTiles(Map map, int howManyTiles);

    public void placeTileNextToNeighbor(char neighborTileChar, Map map, int numberOfNeededTiles) {
        int maxIndex = map.getMapSize() - 1;
        int tileCount = 0;
        while(tileCount < numberOfNeededTiles) {
            int randomX = random.nextInt(maxIndex);
            int randomY = random.nextInt(maxIndex);
            boolean placeable = validator.neighborIsValid(randomX, randomY, neighborTileChar, map);
            if(placeable) {
                map.setTile(randomX, randomY, tileChar);
                tileCount++;
            }
        }
    }
}
