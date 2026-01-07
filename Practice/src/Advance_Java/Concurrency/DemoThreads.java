package Advance_Java.Concurrency;

public class DemoThreads {
    static void main() throws Exception {
        Counter counter = new Counter(); // Create an instance
        Runnable obja = () -> {
            for (int i = 0; i < 10000; ++i) {
                counter.increment(); // Call on instance
            }
        };
        Runnable objb = () -> {
            for (int i = 0; i < 10000; ++i) {
                counter.increment(); // Call on instance
            }
        };
        Thread t1 = new Thread(obja);
        Thread t2 = new Thread(objb);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(counter.count);
    }
}

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}