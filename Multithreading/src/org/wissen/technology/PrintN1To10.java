package org.wissen.technology;
//PrintN1To10
// class level lock

class NumberPrinter implements Runnable {
    private static int n = 10;
    private static int currentNumber = 1;
    private static Object lock = new Object();

    private int threadId;
    
    public NumberPrinter(int threadId) {
        this.threadId = threadId;
    }

    @Override
    public void run() {
        while (currentNumber <= n) {
            synchronized (lock) {
                if (currentNumber % 3 == threadId - 1) {
                    System.out.println("Thread-" + threadId + " : " + currentNumber);
                    currentNumber++;
                    lock.notifyAll();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
}

public class PrintN1To10 {
    public static void main(String[] args) {
        int n = 10;

        Thread thread1 = new Thread(new NumberPrinter(3), "Thread-3");
        Thread thread2 = new Thread(new NumberPrinter(1), "Thread-1");
        Thread thread3 = new Thread(new NumberPrinter(2), "Thread-2");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

