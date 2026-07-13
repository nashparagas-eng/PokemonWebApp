package ph.edu.dlsu.lbycpob.pokemonwebapp.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvLoader {

    private int totalLines = 0;
    private int skippedLines = 0;
    private final List<String> skippedLineDetails = new ArrayList<>();

    public static String[] loadCSVFromResources(String resourcePath) {
        CsvLoader loader = new CsvLoader();
        return loader.loadCSVFromResourcesInternal(resourcePath);
    }

    public static String[] loadCSV(String filePath) {
        return loadCSV(new File(filePath));
    }

    public static String[] loadCSV(File file) {
        CsvLoader loader = new CsvLoader();
        return loader.loadCSVToStringArray(file);
    }

    private String[] loadCSVFromResourcesInternal(String resourcePath) {
        List<String> validLines = new ArrayList<>();
        totalLines = 0;
        skippedLines = 0;
        skippedLineDetails.clear();

        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resourcePath)) {
            if (inputStream == null) {
                System.err.println("Resource file not found: " + resourcePath);
                return new String[0];
            }
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    totalLines++;
                    if (line.trim().isEmpty()) {
                        skippedLines++;
                        skippedLineDetails.add("Line " + totalLines + ": Empty line");

