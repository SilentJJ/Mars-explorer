package com.codecool.marsexploration.TileGenerator;

import com.codecool.marsexploration.logic.Map;

public class TileValidator {

    private final Map map;

    public TileValidator(Map map) {
        this.map = map;
    }

    public boolean isEmpty(int x, int y) {
        return tileIS(x, y, ' ');
    }

    public boolean neighborIsValid(int x, int y, char tile, char neighbor) {
        if (tileIS(x, y, tile) && (tileIS(x + 1, y, neighbor) || tileIS(x - 1, y, neighbor) || tileIS(x, y + 1, neighbor) || tileIS(x, y - 1, neighbor))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tileIS(int x, int y, char tile) {
        return map.getTile(x, y) == tile && validCoordinate(x, y);
    }

    private boolean validCoordinate(int x, int y) {
        return map.getMapSize() > x && map.getMapSize() > y;
    }
}
