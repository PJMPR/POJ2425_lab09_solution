package com.example.cache;

import com.example.model.DictionaryValue;

import java.util.List;

public class DictionaryCache {
    private List<DictionaryValue> dictionary;
    static {
        cache = new DictionaryCache();
    }
    private static final DictionaryCache cache;

    public static DictionaryCache getInstance() {
        return cache;
    }

    public void setItems(List<DictionaryValue> dictionaryValues) {
        this.dictionary = dictionaryValues;
    }

    public List<DictionaryValue> getItems() {
        return dictionary;
    }


}
