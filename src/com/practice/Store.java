package com.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    private ArrayList <Order> Orders;
    private ArrayList <Customer> Customers;

    public Store (){
        Orders = new ArrayList<Order>();
        Customers = new ArrayList<Customer>();
        var filename = "Customers.txt";
        Scanner scanner = new Scanner();


    }
//    public static void Store(String [] args) throws FileNotFoundException {
//
//
//        try{
//            Scanner scanner = new Scanner(new FileReader("Customers.txt"));
//        }
//
//
//    }
}
