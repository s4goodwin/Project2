package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Store {
    private ArrayList<Order> Orders;
    private ArrayList<String> Customers;
    private Scanner scanner;

    public List<String> Store(String[] args) throws FileNotFoundException {
        //scanner = new Scanner(new File(""));
        Orders = new ArrayList<Order>();
        Customers = new ArrayList<String>();
        List<String> lines = Collections.emptyList();

        try (Scanner scanner = new Scanner(new File("Customers.txt")).useDelimiter("\\s*,\\s*")){
            while (scanner.hasNext()){
                Customers.add(scanner.next());
            }
        }
    return Customers;
    }
}
