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

    public void runStore(){
        var inputReader = new Scanner(System.in);
        while(true){
            printMenu();
            var userChoice = inputReader.nextInt();
            switch (userChoice){
                case 1:
                    addCustomer(inputReader);
                    break;
                case 2:


            }
        }
    }
    private void printMenu(){
        System.out.println("======================");
        System.out.println("What would you like to do?");
        System.out.println("   [1] Add customer");
        System.out.println("   [2] Select customer");
        System.out.println("   [3] Exit the program");
        System.out.println("======================");
    }

    private void addCustomer(Scanner inputReader){
        inputReader.nextLine();
        System.out.println("Enter the new customers name: ");
        var newCustomerName = inputReader.nextLine();
        Customers.add(newCustomerName);
    }

    private void selectCustomer(Scanner inputReader){
        inputReader.nextLine();
        System.out.println("What is the first and last name of the customer you are trying to select: ");
        var nameToFind = inputReader.nextLine();

    }
}
