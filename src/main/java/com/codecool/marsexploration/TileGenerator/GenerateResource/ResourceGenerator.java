package com.codecool.marsexploration.TileGenerator.GenerateResource;

import com.codecool.marsexploration.TileGenerator.TileGenerator;

public abstract class ResourceGenerator implements TileGenerator {

    private char resource;
    private char placeNextTo;

    public ResourceGenerator(char resource, char placeNextTo) {
        this.resource = resource;
        this.placeNextTo = placeNextTo;
    }

    @Override
    public void generateTiles() {

    }
}
