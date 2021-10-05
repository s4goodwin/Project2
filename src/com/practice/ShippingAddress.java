package com.practice;

public class ShippingAddress {
    private String AddressLine1;
    private String AddressLine2;
    private String City;
    private String State;
    private String PostalCode;

    public ShippingAddress(String line1, String line2, String cityName, String stateName, String zipCode){
        AddressLine1 = line1;
        AddressLine2 = line2;
        City = cityName;
        State = stateName;
        PostalCode = zipCode;
    }

    public String toString() {
        var wholeAddress = AddressLine1 +"\n"+ AddressLine2;
        return wholeAddress;
    }

}


