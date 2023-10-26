package com.codecool.marsexploration.logic.fileWriter;

import com.codecool.marsexploration.logic.Map;

import java.io.*;

public class MapFileWriter implements FileWriter{

    private Map map;

    public MapFileWriter(Map map) {
        this.map = map;
    }

    private static String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }

    @Override
    public void writeMapToFile() {
        //String oneLine = String.join("", String.copyValueOf(map.getMap()[0]));
        String mapInOne = "";
        for (char[] line : map.getMap()) {
            mapInOne += String.join("", String.copyValueOf(line)) + "\n";
        }

        try {
            FileOutputStream outputStream = new FileOutputStream("src/main/resources/exploration-test.map");

            outputStream.write(mapInOne.getBytes());
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
