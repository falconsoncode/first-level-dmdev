package com.dmdev.cs.homework.homework_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class CSVParser {

    public static Map<Integer, String[]> readCSV(String filePath, boolean skipHeader, Consumer<String[]> processLine) throws IOException {
        Map<Integer, String[]> result = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            if (skipHeader) {
                reader.readLine(); // Пропускаем строку заголовка
            }

            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                processLine.accept(values);
            }
        }

        return result;
    }

    public static void writeCSV(String filePath, String header, Map<Integer, String[]> data, boolean includeErrors) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(header + "\n");

            for (Map.Entry<Integer, String[]> entry : data.entrySet()) {
                int id = entry.getKey();
                String[] values = entry.getValue();

                if (!includeErrors && values[0].contains("N/A")) {
                    continue;
                }

                writer.write(id + "," + String.join(",", values) + "\n");
            }
        }
    }

    public static Map<Integer, String[]> mergeData(Map<Integer, String[]> pricesData, Map<Integer, String[]> namesData) {
        Map<Integer, String[]> mergedData = new HashMap<>(pricesData);

        for (Map.Entry<Integer, String[]> entry : namesData.entrySet()) {
            int id = entry.getKey();
            String[] nameData = entry.getValue();

            if (mergedData.containsKey(id)) {
                mergedData.get(id)[0] = nameData[0] + "," + mergedData.get(id)[0];
            } else {
                mergedData.put(id, new String[]{nameData[0] + ",N/A"});
            }
        }

        return mergedData;
    }

    public static void mergeFiles(String itemsPriceFile, String itemsNameFile, String resultFile, String errorsFile) {
        try {
            Map<Integer, String[]> pricesData = new HashMap<>();
            Map<Integer, String[]> namesData = new HashMap<>();

            CSVParser.readCSV(itemsPriceFile, true, values -> {
                int id = Integer.parseInt(values[0]);
                pricesData.put(id, new String[]{values[1]});
            });

            CSVParser.readCSV(itemsNameFile, true, values -> {
                int id = Integer.parseInt(values[0]);
                namesData.put(id, new String[]{values[1]});
            });

            Map<Integer, String[]> mergedData = CSVParser.mergeData(pricesData, namesData);

            CSVParser.writeCSV(resultFile, "ID,NAME,PRICE", mergedData, false);
            CSVParser.writeCSV(errorsFile, "ID", mergedData, true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
