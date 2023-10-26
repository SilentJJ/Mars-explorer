package com.codecool.marsexploration.TileGenerator.GenerateResource;

import com.codecool.marsexploration.TileGenerator.TileEnum;
import com.codecool.marsexploration.TileGenerator.TileValidator;

public class MineralGenerator extends ResourceGenerator {
    public MineralGenerator(TileValidator validator) {
        super(TileEnum.MINERAL.getTileChar(), TileEnum.MOUNTAIN.getTileChar(), validator);
    }
}
