package com.codecool.marsexploration.TileGenerator.GenerateShapes;

import com.codecool.marsexploration.TileGenerator.TileGenerator;
import com.codecool.marsexploration.TileGenerator.TileValidator;
import com.codecool.marsexploration.logic.Map;

public abstract class ShapeGenerator extends TileGenerator {

    public ShapeGenerator(char shapeChar, TileValidator validator) {
        super(shapeChar, validator);
    }

    @Override
    public void generateTiles(Map map, int howManyTiles) {
        int mapSize = map.getMapSize();
        int howManyStarterTile = Math.round(howManyTiles / 10);
        int starterTileCount = 0;
        while(starterTileCount <= howManyStarterTile) {
            int randomX = random.nextInt(mapSize - 1);
            int randomY = random.nextInt(mapSize - 1);
            boolean placeable = validator.isEmpty(randomX, randomY, map);
            if(placeable) {
                map.setTile(randomX, randomY, tileChar);
                ++starterTileCount;
            }
        }
        placeTilesNextTo(tileChar, map, howManyTiles - howManyStarterTile);
    }

}
