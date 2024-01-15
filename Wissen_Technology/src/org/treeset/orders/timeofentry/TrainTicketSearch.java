package org.treeset.orders.timeofentry;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class TrainTicketSearch {

	public static ArrayList<TrainTicket> orderSearchWithinGivenTime(TreeSet<TrainTicket> order, String startTime,
			String endTime) {
		ArrayList<TrainTicket> result;
		TrainTicket start = new TrainTicket("", startTime);
		TrainTicket end = new TrainTicket("", endTime);
		
		SortedSet<TrainTicket> subSet = order.subSet(start, true, end, true);
		
		return new ArrayList<>(subSet);
	}
	
	public static void main(String[] args) {
		TreeSet<TrainTicket> order = new TreeSet<>(); 
	
		order.add(new TrainTicket("5010","17:18"));
		order.add(new TrainTicket("5011","14:30"));
		order.add(new TrainTicket("5012","12:05"));
		order.add(new TrainTicket("5013","12:08"));
		
		String startTime = "12:07";
		String endTime = "17:18";
		
		ArrayList<TrainTicket> finalResult = orderSearchWithinGivenTime(order, startTime, endTime);
		
		for(TrainTicket trainTicket: finalResult) {
			System.out.println("Ticket id: "+trainTicket.getTicketId()+ ", Entry: "+trainTicket.getEntryOfTime());
		}

	}

}
