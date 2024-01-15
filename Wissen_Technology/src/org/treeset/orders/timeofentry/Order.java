package org.treeset.orders.timeofentry;

import java.time.LocalTime;
import java.util.*;

class Order implements Comparable<Order> {
    private String orderId;
    private LocalTime timeOfEntry;

    public Order(String orderId, String timeOfEntry) {
        this.orderId = orderId;
        this.timeOfEntry = LocalTime.parse(timeOfEntry);
    }

    public String getOrderId() {
        return orderId;
    }

    public LocalTime getTimeOfEntry() {
        return timeOfEntry;
    }

    @Override
    public int compareTo(Order other) {
        return this.timeOfEntry.compareTo(other.timeOfEntry);
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", timeOfEntry=" + timeOfEntry + "]";
    }
}