package org.digitalocean;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
	private int sharedVariable = 0;
	private Lock lock = new ReentrantLock();

	public void incrementSharedVariable() {
		for (int i = 0; i < 1000000; i++) {
			// Acquire the lock before modifying the shared resource
			lock.lock();
			try {
				sharedVariable++;
			} finally {
				// Release the lock in a finally block to ensure it's released
				lock.unlock();
			}
		}
	}

	public int getSharedVariable() {
		return sharedVariable;
	}
}

public class LockingMechanism {
	public static void main(String[] args) throws InterruptedException {
		SharedResource sharedResource = new SharedResource();

		// Create two threads
		Thread thread1 = new Thread(() -> sharedResource.incrementSharedVariable());
		Thread thread2 = new Thread(() -> sharedResource.incrementSharedVariable());

		// Start the threads
		thread1.start();
		thread2.start();

		// Wait for both threads to finish
		thread1.join();
		thread2.join();

		// Print the final value of the shared variable
		System.out.println("Final value of sharedVariable: " + sharedResource.getSharedVariable());
	}
}
