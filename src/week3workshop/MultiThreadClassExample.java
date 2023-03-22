package week3workshop;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadClassExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scanner.nextInt();
        System.out.println("Enter y");
        int y = scanner.nextInt();

        ExecutorService executor = Executors.newFixedThreadPool(y);

        for (int i = 0; i < x; i++) {
            System.out.println(Thread.currentThread().getId() +": " + i);
            executor.execute( new PrintNumbers());
        }

        executor.shutdown();
    }
}
