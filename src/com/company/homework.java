package com.company;

import java.util.HashMap;

public class homework {

    public static void main(String[] args) {

        HashMap<String, String> Vehicles = new HashMap<String, String>();
        Vehicles.put("Honda", "Fit");
        Vehicles.put("Honda", "Civic");
        Vehicles.put("Toyota", "Celica");
        Vehicles.put("Toyota", "Land Cruiser");


        System.out.println("Hello, does your dealership have a Civic?");

        System.out.println(Vehicles.containsValue("Civic"));

    }
}