package org.treeset.orders.timeofentry;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class OrderSearch {

    public static List<Order> searchOrdersByTime(TreeSet<Order> orders, String startTime, String endTime) {
        Order startOrder = new Order("", startTime);
        Order endOrder = new Order("", endTime);

        // Using subset to get orders within the specified interval
        Set<Order> result = orders.subSet(startOrder, true, endOrder, true);
        System.out.println(result);

        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        TreeSet<Order> orders = new TreeSet<>();
        orders.add(new Order("0124", "10:15"));
        orders.add(new Order("0345", "09:15"));
        orders.add(new Order("0873", "13:30"));

        String startTime = "09:15";
        String endTime = "13:30";

        List<Order> result = searchOrdersByTime(orders, startTime, endTime);

        System.out.println("Orders between " + startTime + " and " + endTime + ":");
        for (Order order : result) {
            System.out.println("Order ID: " + order.getOrderId() + ", Time of Entry: " + order.getTimeOfEntry());
        }
    }
}