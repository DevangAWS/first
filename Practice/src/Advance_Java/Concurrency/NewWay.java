package Advance_Java.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewWay {
    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for(int i = 0; i < 10000; ++i) {
                executor.submit(() -> System.out.println("I am a lightweight thread!"));
            }
        }

    }
}