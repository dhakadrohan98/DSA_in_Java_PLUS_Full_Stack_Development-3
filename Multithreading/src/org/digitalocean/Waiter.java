package org.digitalocean;

//A class that will wait for other threads to invoke notify methods to complete it’s processing. 
//Notice that Waiter thread is owning monitor on Message object using synchronized block.
public class Waiter implements Runnable {

	private Message msg;
	
	//Injecting object of Message into Waiter class's constructor.
	public Waiter(Message msg) {
		this.msg = msg;
	}
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		//synchronized block is used to own the monitor of Message object.
		synchronized (msg) {
			try {
				System.out.println(threadName+"-> waiting to get notified at time:"+System.currentTimeMillis());
				msg.wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadName+"-> thread got notified at time:"+System.currentTimeMillis());
			//process the message now
            System.out.println(threadName+" is processed by "+msg.getMsg());
		}
		
	}

}
