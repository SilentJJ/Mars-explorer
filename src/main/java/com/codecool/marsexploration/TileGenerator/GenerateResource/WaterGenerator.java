package com.codecool.marsexploration.TileGenerator.GenerateResource;

import com.codecool.marsexploration.TileGenerator.GenerateResource.ResourceGenerator;
import com.codecool.marsexploration.TileGenerator.TileEnum;

public class WaterGenerator extends ResourceGenerator {
    public WaterGenerator() {
        super(TileEnum.WATER.getTileChar(), TileEnum.PIT.getTileChar());
    }
}
