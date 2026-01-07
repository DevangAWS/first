package Advance_Java.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 25; ++i) {
            int finalI = i;
            pool.submit(() -> System.out.println("Task " + finalI + " is running on thread " + Thread.currentThread().getName()));
        }

        pool.shutdown();
    }
}