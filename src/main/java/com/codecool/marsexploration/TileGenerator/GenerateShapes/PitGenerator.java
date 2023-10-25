package com.codecool.marsexploration.TileGenerator.GenerateShapes;

import com.codecool.marsexploration.TileGenerator.GenerateShapes.ShapeGenerator;
import com.codecool.marsexploration.TileGenerator.TileEnum;

public class PitGenerator extends ShapeGenerator {
    public PitGenerator() {
        super(TileEnum.PIT.getTileChar());
    }
}
