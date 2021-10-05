package com.practice;

import org.w3c.dom.ls.LSOutput;

public class Order {
    private String destination;
    private String orderedBy;

    public Order(String shippingAddress, String customer) {
        destination = shippingAddress;
        orderedBy = customer;
    }



    public ShippingAddress getDestination(String shippingAddress){
        return null;
    }
}

