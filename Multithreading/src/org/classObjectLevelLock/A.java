package org.classObjectLevelLock;

public class A {
	
	public synchronized void m1() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

//o1, o2 are objects of class A
//t1->o1.m1()
//t2->o2.m1()
//
//will m1() method execute one after one or parallely by objects in above code snippet.
//
//Ans: Object lock will be acquired on m1() method, it will allow to execute m1() method parallel via different
//objects only.