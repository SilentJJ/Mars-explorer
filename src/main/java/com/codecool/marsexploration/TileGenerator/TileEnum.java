package com.codecool.marsexploration.TileGenerator;

public enum TileEnum {
    MOUNTAIN('^'),
    PIT('#'),
    MINERAL('*'),
    WATER('~');

    private final char tileChar;

    TileEnum(char tileChar) {
        this.tileChar = tileChar;
    }

    public char getTileChar() {
        return tileChar;
    }
}
