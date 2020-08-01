package com.vijay.advancedTopics.concurrencyAndMultiThreading;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show() {

        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();

        // start all threads
        for (var i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        // wait for all threads to finish
        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nTotal Number of Bytes read: " + status.getTotalBytes());

    }
}
