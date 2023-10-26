package com.codecool.marsexploration.logic;

public class Map {

    private int mapSize;
    public char[][] doneMap;

    public Map(int mapSize) {
        this.mapSize = mapSize;
        this.doneMap = generateEmptyMap();
    }

    public char[][] getMap() {
        return doneMap;
    }

    public int getMapSize() {
        return mapSize;
    }

    private char[][] generateEmptyMap() {
        char[][] map = new char[mapSize][mapSize];

        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = (' ');
            }
        }

        for (char[] uhg : map) {
            System.out.println("-");
            System.out.println(uhg);
        }

        return map;
    }

    public char getTile(int x, int y) {
        return doneMap[x][y];
    }

    public void setTile(int x, int y, char tileToSet) {
        doneMap[x][y] = tileToSet;
    }

    //coordinate.setTile(x, y, 'm');

}
