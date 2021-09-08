package com.engeto.examples;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String clientName = "Anna Svobodova";
        int sales = 28;
        String nameOfCity = "Ostrava";
        double consumption = 4.25;
        double cableAvailable = 1265;
        LocalDate dateOfBirth = LocalDate.of(1988, 11,4);
        String registrationOfVehicle = "2OV 6528";
        String ipAddress = "183.245.0.1";
        System.out.printf("Client's name: %s\n", clientName);
        System.out.printf("Numbers of sales: %d\n", sales);
        System.out.printf("Name of City: %s\n", nameOfCity);
        System.out.printf("Consumption of vehicle: %g l/100km\n", consumption);
        System.out.printf("Available cable length: %g m\n", cableAvailable);
        System.out.printf("Date of Birth %tF\n", dateOfBirth);
        System.out.printf("Registration of Vehicle: %s\n", registrationOfVehicle);
        System.out.printf("IP address: %s\n", ipAddress);
    }
}