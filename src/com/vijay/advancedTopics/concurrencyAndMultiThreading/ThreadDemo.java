package com.vijay.advancedTopics.concurrencyAndMultiThreading;

public class ThreadDemo {
    public static void show() {
        var status = new DownloadStatus();

        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {
            while(!status.isDone()) {}  // waits until thread1 is done
            System.out.println(status.getTotalBytes());
        });

        thread1.start();
        thread2.start();

    }
}
