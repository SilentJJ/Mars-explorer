package com.codecool.marsexploration.data;

import java.util.ArrayList;
import java.util.List;

public class MapGen {

    private int mapSize;

    public MapGen(int mapSize) {
        this.mapSize = mapSize;
    }

    public List<List<Character>> getMap() {
        List<List<Character>> emptyMap = generateEmptyMap();
        return emptyMap;
    }

    private List<List<Character>> generateEmptyMap() {
        List<List<Character>> xAxis = new ArrayList<>();
        List<Character> yAxis = new ArrayList<>();

        for (int j = 0; j < mapSize; j++) {
            yAxis.add(' ');
        }
        for (int i = 0; i < mapSize; i++) {
            xAxis.add(List.copyOf(yAxis));
        }

        return xAxis;
    }

}
