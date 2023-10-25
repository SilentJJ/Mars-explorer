package com.codecool.marsexploration.TileGenerator.GenerateShapes;

import com.codecool.marsexploration.TileGenerator.TileGenerator;

public abstract class ShapeGenerator implements TileGenerator {

    private final char shapeChar;

    public ShapeGenerator(char shapeChar) {
        this.shapeChar = shapeChar;
    }

    public void generateTiles() {

    }

}
