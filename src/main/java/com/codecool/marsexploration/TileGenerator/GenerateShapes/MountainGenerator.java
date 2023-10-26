package com.codecool.marsexploration.TileGenerator.GenerateShapes;

import com.codecool.marsexploration.TileGenerator.GenerateShapes.ShapeGenerator;
import com.codecool.marsexploration.TileGenerator.TileEnum;
import com.codecool.marsexploration.TileGenerator.TileValidator;

public class MountainGenerator extends ShapeGenerator {
    public MountainGenerator(TileValidator validator) {
        super(TileEnum.MOUNTAIN.getTileChar(), validator);
    }
}
