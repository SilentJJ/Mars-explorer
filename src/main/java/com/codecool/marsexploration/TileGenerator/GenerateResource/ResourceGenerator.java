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
        placeTilesNextTo(placeNextTo, map, howManyTiles);
    }
}
