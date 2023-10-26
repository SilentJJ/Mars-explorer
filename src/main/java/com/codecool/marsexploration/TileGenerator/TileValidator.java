package com.codecool.marsexploration.TileGenerator;

import com.codecool.marsexploration.logic.Map;

public class TileValidator {

    public boolean isEmpty(int x, int y, Map map) {
        return tileIS(x, y, ' ', map);
    }

    public boolean neighborIsValid(int x, int y, char tile, char neighbor, Map map) {
        if (isEmpty(x, y, map) && (tileIS(x + 1, y, neighbor, map) || tileIS(x - 1, y, neighbor, map) || tileIS(x, y + 1, neighbor, map) || tileIS(x, y - 1, neighbor, map))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tileIS(int x, int y, char tile, Map map) {
        if (x >= 0 && x < map.getMapSize() && y >= 0 && y < map.getMapSize()) {
            return map.getTile(x, y) == tile;
        } else {
            return false;
        }
    }
}
