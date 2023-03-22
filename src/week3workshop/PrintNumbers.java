package week3workshop;

public class PrintNumbers implements Runnable {
    @Override
    public synchronized void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() +": " + i);
        }
    }
}