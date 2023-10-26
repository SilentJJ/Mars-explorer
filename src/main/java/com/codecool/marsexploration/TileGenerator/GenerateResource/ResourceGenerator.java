package com.codecool.marsexploration.TileGenerator.GenerateResource;

import com.codecool.marsexploration.TileGenerator.TileGenerator;
import com.codecool.marsexploration.TileGenerator.TileValidator;
import com.codecool.marsexploration.data.Map;

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
        while(tileCount <= howManyTiles) {
            int randomX = (int)Math.floor(Math.random() * (mapSize + 1));
            int randomY = (int)Math.floor(Math.random() * (mapSize + 1));
            boolean placeable = validator.neighborIsValid(randomX, randomY, tileChar, placeNextTo, map);
            if(placeable) {
                map.setTile(randomX, randomY, tileChar);
                tileCount++;
            }
        }
    }
}
