package com.practice;

public class Order {
    private ShippingAddress destination;
    private Customer orderedBy;

    public Order(ShippingAddress Destination, Customer OrderedBy) {
        destination = Destination;
        orderedBy = OrderedBy;
    }

    public String getDestination(){
        return destination.toString();
    }
    public String getOrderedBy(){
        return orderedBy.toString();
    }
}

