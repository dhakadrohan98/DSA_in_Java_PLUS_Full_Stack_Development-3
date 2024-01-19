package org.concurrency.control;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//Concurrent HashMap concepts implementation

public class CopyOnWriteList {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		
		list.add("first1");
		list.add("second");
		list.add("third");
		list.add("fourth");
		list.add("first2");
		list.add("first3");
		list.add("first4");
		list.add("first5");
		list.add("first6");
		list.add("first7");
		list.add("first8");
		list.add("first9");
		list.add("first10");
		list.add("first11");
		list.add("first12");
		
		Runnable th1 = () -> {
			for (String str : list) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(str);
			}
		};
		
		Runnable th2 = () -> {
			list.add("new item1");
			list.add("new item2");
			list.add("new item3");
		};
		
		new Thread(th2).start();
		new Thread(th1).start();

	}

}
