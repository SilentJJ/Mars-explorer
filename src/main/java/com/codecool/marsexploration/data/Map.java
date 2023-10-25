package com.codecool.marsexploration.data;

public class Map {

    private int mapSize;
    public char[][] doneMap;

    public Map(int mapSize) {
        this.mapSize = mapSize;
        this.doneMap = getMap();
    }

    public char[][] getMap() {
        char[][] emptyMap = generateEmptyMap();
        return emptyMap;
    }

    public int getMapSize() {
        return mapSize;
    }

    private char[][] generateEmptyMap() {
        char[][] yAxis = new char[mapSize][mapSize];
        char[] xAxis = new char[mapSize];

        for (int j = 0; j < mapSize; j++) {
            xAxis[j] = ('*');
        }
        for (int i = 0; i < mapSize; i++) {
            yAxis[i] = xAxis.clone();
        }

        for (char[] uhg : yAxis) {
            System.out.println("-");
            System.out.println(uhg);
        }

        return yAxis;
    }

    public char getTile(int x, int y) {
        return doneMap[x][y];
    }

    public void setTile(int x, int y, char tileToSet) {
        doneMap[x][y] = tileToSet;
    }

    //coordinate.setTile(x, y, 'm');

}
