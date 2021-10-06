package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Consumer;

public class Store {
    private ArrayList<Order> Orders;
    private ArrayList<Customer> Customers;
    private Scanner scanner;

    public List<String> Store(String[] args) throws FileNotFoundException {
        scanner = new Scanner(new File(""));
        Orders = new ArrayList<Order>();
        Customers = new ArrayList<Customer>();
        List<String> lines = Collections.emptyList();

        try {
            lines = Files.readAllLines(Paths.get("Customers.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[]names = lines.get(0).split(",");
//        Consumer<? super String> customerName;
//        Arrays.asList(names).forEach(customerName);{
//            Customers.add(new Customer(names));
//            System.out.println(Customers);
//        }
    }
}
