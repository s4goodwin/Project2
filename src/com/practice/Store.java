package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Store {
    private ArrayList<Order> Orders;
    private ArrayList<Customer> Customers;
    private Scanner scanner;

    public Store(String[] args) throws FileNotFoundException {
        scanner = new Scanner(new File(""));
        Orders = new ArrayList<Order>();
        Customers = new ArrayList<Customer>();
        List<String> list = Collections.emptyList();

        try {
            list = Files.readAllLines(Paths.get("Customers.txt"));
            String[]names=list.get(0).split(",");

        }

    }
}
