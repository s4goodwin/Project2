package com.practice;

public class ShippingAddress {
    private String AddressLine1;
    private String AddressLine2;
    private String City;
    private String State;
    private String PostalCode;
    private String EntireAddress;


    public ShippingAddress(String line1, String line2, String cityName, String stateName, String zipCode, String wholeAddress){
        AddressLine1 = line1;
        AddressLine2 = line2;
        City = cityName;
        State = stateName;
        PostalCode = zipCode;
        EntireAddress = wholeAddress;
    }

    public String toString() {
        var wholeAddress = AddressLine1 +"\n"+ AddressLine2 +"\n"+ City+"\n"+State+"\n"+PostalCode;
        String wholeAddress1 = wholeAddress;
        return wholeAddress1;


    }

}


