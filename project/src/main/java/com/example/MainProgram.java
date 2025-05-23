package com.example;

import com.example.patterns.ThreadExample;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class MainProgram {

    public static void main(String[] args) {
        /** ✅ Krok 1: Utwórz klasę DictionaryValue z odpowiednimi polami i metodami */

//        DictionaryValue testValue = new DictionaryValue(1, 2, "POM", "Region", "Woj. Pomorskie");
//        if (testValue != null && testValue.getIntKey() == 2 && "POM".equals(testValue.getStringKey())) {
//            System.out.println("✅ DictionaryValue utworzony poprawnie: " + testValue);
//        } else {
//            System.out.println("❌ Sprawdź konstruktor oraz gettery/settery w klasie DictionaryValue.");
//            return;
//        }

        /** ✅ Krok 2: Utwórz klasę DictionaryFileReader, która odczytuje dane z pliku CSV */

//        DictionaryFileReader reader = new DictionaryFileReader("src/main/resources/dictionaries.csv");
//        if (reader != null) {
//            System.out.println("✅ Reader zainicjalizowany.");
//        } else {
//            System.out.println("❌ Czy stworzyłeś klasę DictionaryFileReader z odpowiednim konstruktorem?");
//            return;
//        }

        /** ✅ Krok 3: Dodaj metodę getRawFileData() do klasy reader */

//        String rawData = reader.getRawFileData();
//        if (rawData != null && rawData.contains("Region")) {
//            System.out.println("Zawartość pliku:\n" + rawData);
//        } else {
//            System.out.println("❌ Czy dodałeś metodę getRawFileData()? Czy poprawnie wczytuje dane z pliku?");
//            return;
//        }

        /** ✅ Krok 4: Dodaj metodę getDictionaryValues() która zwraca listę DictionaryValue */

//        List<DictionaryValue> dictionaryValues = reader.getDictionaryValues();
//        if (dictionaryValues != null && dictionaryValues.size() == 10) {
//            System.out.println("✅ Załadowano 10 rekordów z pliku CSV.");
//        } else {
//            System.out.println("❌ Czy dodałeś metodę getDictionaryValues() i poprawnie sparsowałeś dane?");
//            return;
//        }

        /** ✅ Krok 5: Stwórz klasę DictionaryCache jako Singleton i przekaż do niej dane */

//        DictionaryCache cache = DictionaryCache.getInstance();
//        if (cache != null) {
//            cache.setItems(dictionaryValues);
//            System.out.println("✅ Dane zapisane w cache.");
//
//            /** 🔍 Sprawdzenie: czy dane można pobrać z cache */
//            List<DictionaryValue> cachedValues = cache.getItems();
//            if (cachedValues != null && cachedValues.size() == 10) {
//                System.out.println("✅ Dane poprawnie pobrane z cache (" + cachedValues.size() + " elementów).");
//            } else {
//                System.out.println("❌ Czy metoda getItems() w klasie DictionaryCache działa poprawnie?");
//                return;
//            }
//        } else {
//            System.out.println("❌ Czy poprawnie zaimplementowałeś klasę Singleton (DictionaryCache)?");
//            return;
//        }

        /** ✅ Krok 6: Wątek odświeżający dane w tle (DictionaryCacheRefresher) */
        /** Dodaj do klasy DictionaryCacheRefresher logikę, która przy każdej aktualizacji danych
         * nie tylko wypisze liczbę rekordów, ale także pełną zawartość cache’a – linia po linii.
         */
        
//        DictionaryCacheRefresher refresher = new DictionaryCacheRefresher();
//        if (refresher != null) {
//            refresher.start();
//            System.out.println("✅ Wątek odświeżający został uruchomiony.");
//        } else {
//            System.out.println("❌ Czy stworzyłeś klasę dziedziczącą po Thread o nazwie DictionaryCacheRefresher?");
//        }

        /** 📝 Uwaga dla studentów:
         * Po uruchomieniu aplikacji spróbuj ręcznie zmodyfikować plik 'dictionaries.csv'
         * (np. dodaj nowy wiersz lub usuń istniejący), aby zobaczyć, czy wątek poprawnie odświeża dane w cache.
         * Wątek powinien wypisywać zaktualizowaną liczbę rekordów za każdym odświeżeniem.
         */
    }
}
