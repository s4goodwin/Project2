package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Store {
    private ArrayList<Order> Orders;
    private ArrayList<String> Customers;
    private Scanner scanner;

    public static void main(String args){
        Store store = new Store();
        store.runStore();
    }

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
            printrunStoreMenu();
            var userChoice = inputReader.nextInt();
            switch (userChoice){
                case 1:
                    addCustomer(inputReader);
                    break;
                case 2:
                    selectCustomer(inputReader);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    public void manageCustomer(Customer selectedCustomer){
        var inputReader2 = new Scanner(System.in);
        while (true){
            printmanageCustomerMenu();
            var userChoice2 = inputReader2.nextInt();
            switch (userChoice2){
                case 1:
                    addAddress(inputReader2);
                    break;
                case 2:
                    makeOrder(inputReader2);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    private void makeOrder(Scanner inputReader2) {
        for (var addressList : Customers){
            var orderCustomer = getCustomer(addressList);
            if(orderCustomer.isPresent()){
                return;
            }
            else System.out.println("No known customer exists");
    }

    }


    private void printrunStoreMenu(){
        System.out.println("======================");
        System.out.println("What would you like to do?");
        System.out.println("   [1] Add customer");
        System.out.println("   [2] Select customer");
        System.out.println("   [3] Exit the program");
        System.out.println("======================");
    }

    private void printmanageCustomerMenu(){
        System.out.println("======================");
        System.out.println("What would you like to do?");
        System.out.println("   [1] Add address");
        System.out.println("   [2] Make order");
        System.out.println("   [3] Exit the program");
        System.out.println("======================");
    }

    private void addCustomer(Scanner inputReader){
        inputReader.nextLine();
        System.out.println("Enter the new customers name: ");
        var newCustomerName = inputReader.nextLine();
        Customers.add(newCustomerName);
    }

    private void addAddress(Scanner inputReader){
        inputReader.nextLine();
        System.out.println("Enter the new customers address: ");
        var newCustomerAddress = inputReader.nextLine();
        Customers.add(newCustomerAddress);
    }

    private void selectCustomer(Scanner inputReader){
        inputReader.nextLine();
        System.out.println("What is the first and last name of the customer you are trying to select: ");
        var nameToFind = inputReader.nextLine();
        var customer = getCustomer(nameToFind);
        if(customer.isPresent()){
            return;
        }
        else System.out.println("No known customer exists");
    }

    private Optional<String> getCustomer(String customerName){
        for(var currentCustomer : Customers){
            if(currentCustomer==customerName)
                return Optional.of(currentCustomer);
        }
        return Optional.empty();
    }


}
