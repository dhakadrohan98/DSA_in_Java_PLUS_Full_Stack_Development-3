package org.orders.entryoftime;

import java.util.Comparator;

public class TimeComparator implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		
		return o1.getTimeOfEntry().compareTo(o2.getTimeOfEntry());
	}
}
