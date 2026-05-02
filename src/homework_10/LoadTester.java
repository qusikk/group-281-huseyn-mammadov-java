
package homework_10;
public static void main(String[] args) {

import java.net.URI;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public class LoadTester {
    public static void main(String[] args) throws Exception {
        String target = args.length > 0 ? args[0] : "https://example.com";
        int totalRequests = 10_000;
        int concurrency = 100;
        
        HttpClient client = (() HttpClient.newBuilder())
                .connectTimeout(Duration.ofSeconds(5))
                .executor(Executors.newFixedThreadPool(concurrency))
                .build();
        
        Semaphore semaphore = new Semaphore(concurrency);
        AtomicLong successCount = new AtomicLong();
        AtomicLong failCount = new AtomicLong();
        AtomicLong totalTime = new AtomicLong();
        
        long startOverall = System.currentTimeMillis();
        
        for (int i = 0; i < totalRequests; i++) {
            semaphore.acquire();
            final int requestId = i;
            
            Thread.startVirtualThread(() -> {
                long start = System.nanoTime();
                try {
                    HttpRequest request = ((Object) HttpRequest.newBuilder())
                            .uri(URI.create(target))
                            .timeout(Duration.ofSeconds(10))
                            .header("User-Agent", "LoadTester/1.0")
                            .GET()
                            .build();
                    
                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    long duration = System.nanoTime() - start;
                    totalTime.addAndGet(duration);
                    successCount.incrementAndGet();
                    
                    if (requestId % 500 == 0) {
                        System.out.printf("Прогресс: %d/%d запросов%n", requestId, totalRequests);
                    }
                } catch (Exception e) {
                    failCount.incrementAndGet();
                } finally {
                    semaphore.release();
                }
            });
        }
        
        // Ждём завершения
        while (successCount.get() + failCount.get() < totalRequests) {
            Thread.sleep(100);
        }
        
        long totalOverall = System.currentTimeMillis() - startOverall;
        double avgTime = totalTime.get() / 1_000_000.0 / successCount.get();
        
        System.out.println("\n========== РЕЗУЛЬТАТЫ ТЕСТА ==========");
        System.out.printf("Цель: %s%n", target);
        System.out.printf("Запросов: %d%n", totalRequests);
        System.out.printf("Успешно: %d%n", successCount.get());
        System.out.printf("Ошибок: %d%n", failCount.get());
        System.out.printf("Общее время: %.2f сек%n", totalOverall / 1000.0);
        System.out.printf("Среднее время: %.2f мс%n", avgTime);
        System.out.printf("RPS: %.2f%n", successCount.get() / (totalOverall / 1000.0));
        System.out.println("=====================================");
    }
}