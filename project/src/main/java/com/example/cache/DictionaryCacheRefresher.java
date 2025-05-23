package com.example.cache;

import com.example.model.DictionaryValue;
import com.example.readers.DictionaryFileReader;

public class DictionaryCacheRefresher extends Thread {

    public void run() {
        while (true) {
            DictionaryCache
                    .getInstance()
                    .setItems(
                            new DictionaryFileReader("src/main/resources/dictionaries.csv")
                                    .getDictionaryValues());
            System.out.println("Dictionary cache refreshed");
            for (DictionaryValue dictionaryValue : DictionaryCache.getInstance().getItems()) {
                System.out.println(dictionaryValue);
            }
            stopFor(10000);
        }

    }

    private static void stopFor(long miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
