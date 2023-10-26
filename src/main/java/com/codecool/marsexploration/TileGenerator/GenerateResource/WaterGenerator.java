package com.codecool.marsexploration.TileGenerator.GenerateResource;

import com.codecool.marsexploration.TileGenerator.GenerateResource.ResourceGenerator;
import com.codecool.marsexploration.TileGenerator.TileEnum;
import com.codecool.marsexploration.TileGenerator.TileValidator;

public class WaterGenerator extends ResourceGenerator {
    public WaterGenerator(TileValidator validator) {
        super(TileEnum.WATER.getTileChar(), TileEnum.PIT.getTileChar(), validator);
    }
}
