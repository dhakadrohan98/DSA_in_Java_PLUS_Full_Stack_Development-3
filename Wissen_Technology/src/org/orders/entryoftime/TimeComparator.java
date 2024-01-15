package org.orders.entryoftime;

import java.util.Comparator;

public class TimeComparator implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		
		int hour1 = o1.timeOfEntry.getHour();
		int minute1 =  o1.timeOfEntry.getMinute();
		
		int hour2 = o1.timeOfEntry.getHour();
		int minute2 =  o1.timeOfEntry.getMinute();
		
		if(hour1 == hour2 && minute1 == minute2) {
			return 0;
		} else if(hour1 >= hour2 && minute1 >= minute2){
			return 1;
		} else {
			return -1;
		}
	}
}
