package org.concurrency.control;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CocurrentHashMap1 {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("first1");
		list.add("first2");
		list.add("first3");
		list.add("first4");
		list.add("first5");
		
		Runnable runth1 = ()-> {
			for(String str: list) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(str);
			}
		};
		
		Runnable runth2 = ()-> {
			list.add("second1");
			list.add("second2");
			list.add("second3");
		};
		
		new Thread(runth2).start();
		new Thread(runth1).start();
	}

}
