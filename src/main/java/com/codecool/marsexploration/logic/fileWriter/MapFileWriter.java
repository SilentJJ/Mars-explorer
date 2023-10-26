package com.codecool.marsexploration.logic.fileWriter;

import com.codecool.marsexploration.logic.Map;

import java.io.*;

public class MapFileWriter implements FileWriter{

    private Map map;

    public MapFileWriter(Map map) {
        this.map = map;
    }

    @Override
    public void writeMapToFile() {
        String mapInOne = "";
        String mapSize = String.format("%s %s", map.getMapSize(), map.getMapSize());
        for (char[] line : map.getMap()) {
            mapInOne += String.join("", String.copyValueOf(line)) + "\n";
        }

        try {
            FileOutputStream outputStream = new FileOutputStream("src/main/resources/exploration-test.map");
            outputStream.write(mapSize.getBytes());
            outputStream.write(mapInOne.getBytes());
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
