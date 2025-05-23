package com.example.patterns;

public class Program {

    public static void main(String[] args) {
        /**
         * tutaj jest prosty przykład użycia wątków,
         * proszę zapoznaj się z nim.
         * Poniżej masz też zaimplementowaną
         * klasę 'ThreadExample', która w losowym odstępie czasu wypisuje na ekran liczbę od 1 do 10.
         * Poniższa metoda 'useSampleThreads' odpala 4 wątki równocześnie
         */
        useSampleThreads();

        }

    private static void useSampleThreads(){
        /**
         * wywołanie metody na wielu wątkach
         * wykonuje się przez wywołanie metody 'start'
         * (ta metoda jest odziedziczona po klasie Thread)
         */
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();
        new ThreadExample().start();

    }
}
