package com.codecool.marsexploration.TileGenerator.GenerateShapes;

import com.codecool.marsexploration.TileGenerator.TileGenerator;
import com.codecool.marsexploration.TileGenerator.TileValidator;
import com.codecool.marsexploration.logic.Map;

import java.util.Random;

public abstract class ShapeGenerator extends TileGenerator {

    public ShapeGenerator(char shapeChar, TileValidator validator) {
        super(shapeChar, validator);
    }

    @Override
    public void generateTiles(Map map, int howManyTiles) {
        int mapSize = map.getMapSize();
        int tileCount = 0;
        int howManyStarterTile = 1;
        int starterTileCount = 0;
        Random random = new Random();
        while(starterTileCount <= howManyStarterTile) {
            int randomX = random.nextInt(mapSize - 1);
            int randomY = random.nextInt(mapSize - 1);
            boolean placeable = validator.isEmpty(randomX, randomY, map);
            if(placeable) {
                map.setTile(randomX, randomY, tileChar);
                ++starterTileCount;
            }
        }
        while(tileCount <= howManyTiles) {
            int randomX = random.nextInt(mapSize - 1);
            int randomY = random.nextInt(mapSize - 1);
            boolean placeable = validator.neighborIsValid(randomX, randomY, tileChar, tileChar, map);
            if(placeable) {
                map.setTile(randomX, randomY, tileChar);
                ++tileCount;
            }
        }
    }

}
