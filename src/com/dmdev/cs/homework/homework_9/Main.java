package com.dmdev.cs.homework.homework_9;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String itemsPriceFile = "resources/items-price.csv";
        String itemsNameFile = "resources/items-name.csv";
        String resultFile = "resources/result.csv";
        String errorsFile = "resources/errors.csv";

        CSVParser.mergeFiles(itemsPriceFile, itemsNameFile, resultFile, errorsFile);
    }

}
