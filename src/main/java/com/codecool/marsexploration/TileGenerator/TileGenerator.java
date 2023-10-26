package com.codecool.marsexploration.TileGenerator;

import com.codecool.marsexploration.data.Map;

public abstract class TileGenerator {

    protected final char tileChar;
    protected final TileValidator validator;

    public TileGenerator(char tileChar, TileValidator validator) {
        this.tileChar = tileChar;
        this.validator = validator;
    }

    public abstract void generateTiles(Map map, int howManyTiles);
}
