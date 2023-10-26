package com.codecool.marsexploration.TileGenerator;

import com.codecool.marsexploration.logic.Map;

public class TileValidator {

    public boolean isEmpty(int x, int y, Map map) {
        return tileIS(x, y, ' ', map);
    }

    public boolean neighborIsValid(int x, int y, char tile, char neighbor, Map map) {
        if (tileIS(x, y, tile, map) && (tileIS(x + 1, y, neighbor, map) || tileIS(x - 1, y, neighbor, map) || tileIS(x, y + 1, neighbor, map) || tileIS(x, y - 1, neighbor, map))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tileIS(int x, int y, char tile, Map map) {
        return map.getTile(x, y) == tile;
    }
}
