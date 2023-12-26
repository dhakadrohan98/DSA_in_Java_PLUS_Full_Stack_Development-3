package org.digitalocean;

class SharedResource2 {
    // Shared data
    private int sharedCounter = 0;

    // Object-level lock
    private final Object lock = new Object();

    public void incrementCounter() {
        synchronized (lock) {
            // Critical section - only one thread can execute this block at a time for each instance
            sharedCounter++;
            System.out.println("Counter: " + sharedCounter+"| Current Thread: "+Thread.currentThread().getName());
        }
    }
}

class MyThread2 extends Thread {
    private SharedResource2 sharedResource;

    public MyThread2(SharedResource2 sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.incrementCounter();
        }
    }
}

public class ObjectLevellLock {
    public static void main(String[] args) {
        // Creating two instances of SharedResource, each with its own lock
        SharedResource2 resource1 = new SharedResource2();
        SharedResource2 resource2 = new SharedResource2();

        // Creating threads that share different instances of SharedResource
        MyThread2 thread1 = new MyThread2(resource1);
        MyThread2 thread2 = new MyThread2(resource2);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
