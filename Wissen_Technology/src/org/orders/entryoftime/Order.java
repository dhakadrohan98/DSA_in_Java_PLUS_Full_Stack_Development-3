package org.orders.entryoftime;

import java.time.LocalTime;

class Order {
    private String orderId;
    private LocalTime timeOfEntry;

    public Order(String orderId, String  timeOfEntry) {
        this.orderId = orderId;
        this.timeOfEntry = LocalTime.parse(timeOfEntry);
    }

    public String getOrderId() {
        return orderId;
    }

    public LocalTime getTimeOfEntry() {
        return timeOfEntry;
    }
}
