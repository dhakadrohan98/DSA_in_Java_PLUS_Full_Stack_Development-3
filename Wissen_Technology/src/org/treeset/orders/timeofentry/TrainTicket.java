package org.treeset.orders.timeofentry;

import java.time.LocalTime;

public class TrainTicket implements Comparable<TrainTicket> {
	private String ticketId;
	private LocalTime entryOfTime;
	
	TrainTicket(String ticketId,LocalTime entryOfTime) {
		this.ticketId = ticketId;
		this.entryOfTime = entryOfTime;
	}

	public String getTicketId() {
		return ticketId;
	}

	public LocalTime getEntryOfTime() {
		return entryOfTime;
	}
	
	@Override
	public int compareTo(TrainTicket trainTicket) {
		return this.entryOfTime.compareTo(trainTicket.entryOfTime);
	}

	@Override
	public String toString() {
		return "TrainTicket [ticketId=" + ticketId + ", entryOfTime=" + entryOfTime + "]";
	}
}
