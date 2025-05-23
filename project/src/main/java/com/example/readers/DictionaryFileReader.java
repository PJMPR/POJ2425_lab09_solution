package com.example.readers;

import com.example.model.DictionaryValue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DictionaryFileReader {
    private final String filePath;

    public DictionaryFileReader(String filePath) {
        this.filePath = filePath;
    }

    public String getRawFileData() {

        try {
            return readAll();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private String readAll() throws IOException {
      String result = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                result += line;
            }
        }
        return result;
    }

    private List<String[]> read() throws IOException {
        List<String[]> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                result.add(values);
            }
        }
        return result;
    }

    public List<DictionaryValue> getDictionaryValues() {
        try {
            List<DictionaryValue> values = new ArrayList<>();
            for (String[] dictValues : read()){
                values.add(new DictionaryValue(
                        Integer.parseInt(dictValues[0]),
                        Integer.parseInt(dictValues[1]),
                        dictValues[2],
                        dictValues[3],
                        dictValues[4]));
            }
            return values;
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


