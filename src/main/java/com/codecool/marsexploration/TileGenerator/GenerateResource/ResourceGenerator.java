package com.codecool.marsexploration.TileGenerator.GenerateResource;

import com.codecool.marsexploration.TileGenerator.TileGenerator;
import com.codecool.marsexploration.TileGenerator.TileValidator;
import com.codecool.marsexploration.logic.Map;

import java.util.Random;

public abstract class ResourceGenerator extends TileGenerator {

    private final char placeNextTo;

    public ResourceGenerator(char shapeChar, char placeNextTo, TileValidator validator) {
        super(shapeChar, validator);
        this.placeNextTo = placeNextTo;
    }

    @Override
    public void generateTiles(Map map, int howManyTiles) {
        int mapSize = map.getMapSize();
        int tileCount = 0;
        Random random = new Random();
        while(tileCount <= howManyTiles) {
            int randomX = random.nextInt(mapSize - 1);
            int randomY = random.nextInt(mapSize - 1);
            boolean placeable = validator.neighborIsValid(randomX, randomY, tileChar, placeNextTo, map);
            if(placeable) {
                map.setTile(randomX, randomY, tileChar);
                ++tileCount;
            }
        }
    }
}
