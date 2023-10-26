package com.codecool.marsexploration.TileGenerator.GenerateShapes;

import com.codecool.marsexploration.TileGenerator.GenerateShapes.ShapeGenerator;
import com.codecool.marsexploration.TileGenerator.TileEnum;
import com.codecool.marsexploration.TileGenerator.TileValidator;

public class PitGenerator extends ShapeGenerator {
    public PitGenerator(TileValidator validator) {
        super(TileEnum.PIT.getTileChar(), validator);
    }
}
