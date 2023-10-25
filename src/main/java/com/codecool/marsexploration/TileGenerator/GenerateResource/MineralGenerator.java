package com.codecool.marsexploration.TileGenerator.GenerateResource;

import com.codecool.marsexploration.TileGenerator.TileEnum;

public class MineralGenerator extends ResourceGenerator {
    public MineralGenerator() {
        super(TileEnum.MINERAL.getTileChar(), TileEnum.MOUNTAIN.getTileChar());
    }
}
