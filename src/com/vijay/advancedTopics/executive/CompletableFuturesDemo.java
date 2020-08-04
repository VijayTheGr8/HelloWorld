package com.vijay.advancedTopics.executive;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFuturesDemo {
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 1;
        });

        try {
            var result = future
                    .completeOnTimeout(2, 1, TimeUnit.SECONDS)
                    .get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
