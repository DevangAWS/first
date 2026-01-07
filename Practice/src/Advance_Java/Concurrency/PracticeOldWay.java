package Advance_Java.Concurrency;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PracticeOldWay extends Thread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd number");
        int b = scanner.nextInt();
        Runnable task1 = () -> System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
        Runnable task2 = () -> System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
        Runnable task3 = () -> System.out.println("Multiplication of " + a + " and " + b + " is " + a * b);
        Runnable task4 = () -> System.out.println("Division of " + a + " and " + b + " is " + a / b);
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);
        Thread t4 = new Thread(task4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 4; ++i) {
                executor.submit(task1);
            }
        } finally {
            // executor is automatically closed by try-with-resources
            scanner.close();
        }

    }
}