package com.practice;

public class Order {
    private String destination;
    private String orderedBy;

    public Order(String shippingAddress, String customer) {
        destination = shippingAddress;
        orderedBy = customer;
    }

    public String getDestination(){
        return destination.toString();
    }
    public String getOrderedBy(){
        return orderedBy.toString();
    }
}

