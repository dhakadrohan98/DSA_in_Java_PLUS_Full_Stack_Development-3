package org.orders.entryoftime;
import java.time.LocalTime;
import java.util.*;

public class OrderSearch {

    public static List<Order> searchOrdersByTime(List<Order> orders, String startTime, String endTime) {
        List<Order> result = new ArrayList<>();

        LocalTime start = LocalTime.parse(startTime);
        LocalTime end = LocalTime.parse(endTime);

        for (Order order : orders) {
            LocalTime orderTime = order.getTimeOfEntry();
            if (orderTime.isAfter(start) && orderTime.isBefore(end)) {
                result.add(order);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("0124", "10:15"));
        orders.add(new Order("0345", "09:15"));
        orders.add(new Order("0873", "13:30"));
        
        System.out.println(orders);

        String startTime = "09:14";
        String endTime = "13:31";

        List<Order> result = searchOrdersByTime(orders, startTime, endTime);

        System.out.println("Orders between " + startTime + " and " + endTime + ":");
        for (Order order : result) {
            System.out.println("Order ID: " + order.getOrderId() + ", Time of Entry: " + order.getTimeOfEntry());
        }
    }
}
