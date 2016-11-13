package com.sasha.SE_07.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александра on 13.11.2016.
 */
public class Task2 {
    public static void main(String[] args) {
        String path = "com.sasha.SE_07.Task2.prop";

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 3; i++) threads.add(new Thread(new GetProperties(path)));

        threads.forEach(Thread::start);

        try {
            for (Thread x : threads) x.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
