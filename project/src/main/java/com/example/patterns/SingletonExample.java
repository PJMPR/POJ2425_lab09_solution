package com.example.patterns;

/**
 * wzorzec singleton służy do tego aby zapewnic aplikacji tylko jeden obiekt danego typu.
 */
public class SingletonExample {

    /**
     * nalezy 'udaremnić' tworzenie obiektów tego typu poza definicją klasy.
     * W tym celu należy użyć modyfikator private przy konstruktorze
     */
    private SingletonExample() {
    }

    /**
     * Tworzymy pole statyczne w klasie
     * -> obiekt przechowywany w tym polu będzie tzw. singletonem
     */
    private static SingletonExample instance;

    /**
     * Tworzymy statyczną metodę, która za pierwszym użyciem zainicjalizuje obiekt,
     * a potem już będzie go tylko zwracać.
     * Teoretycznie, w aplikacjach wielowątkowych, wiele wątków może w tym samym czasie
     * wywołać metodę co może spowodować utworzenie więcej niż jednego obiektu.
     * Aby się przed tym zabezpieczyć użyto słówko 'synchronized',
     * które powoduje to, że tylko jeden wątek może wywołać tę metodę,
     * a pozostałe muszą czekać, aż on zakończy jej wywoływanie
     */
    public static synchronized SingletonExample getInstance() {
        if (instance == null) instance = new SingletonExample();
        return instance;
    }

}
