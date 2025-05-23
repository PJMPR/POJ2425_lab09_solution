package com.example.patterns;

import java.util.Random;

public class ThreadExample extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(new Random().nextInt(10) * 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }

    }
}
