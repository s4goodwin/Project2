package com.practice;

public class Order {
    private ShippingAddress destination;
    private Customer orderedBy;

    public Order(ShippingAddress destination, Customer orderedBy) {
        this.destination = destination;
        this.orderedBy = orderedBy;
    }

    public String getDestination(){
        return destination.toString();
    }
    public String getOrderedBy(){
        return orderedBy.toString();
    }
}

