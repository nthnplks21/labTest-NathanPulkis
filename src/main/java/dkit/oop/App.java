package dkit.oop;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * OOP CA2 December 2021 - Airplane Management System  STARTER CODE
 */
public class App 
{
    public static void main( String[] args ){
        new App().start();
    }

    private void start() {

        System.out.println("OOP - CA2 - 20% - December 2021 - AirplaneManager");

        //Q1
         CargoAirplane cargoPlane1 = new CargoAirplane("Douglas DC-4",20000);
         CargoAirplane cargoPlane2 = new CargoAirplane("Boeing C-7000",25000);

        // display the two objects
        System.out.println(cargoPlane1.toString());
        System.out.println(cargoPlane2.toString());

        AirplaneManager mgr = new AirplaneManager();

        //Q2
         PassengerAirplane passengerPlane1 = new PassengerAirplane("Boeing 747",524);
         PassengerAirplane passengerPlane2 = new PassengerAirplane("Airbus 380",525);
//         //Add passengers to Passenger planes
         passengerPlane1.addPassenger("Tom Hardy");
         passengerPlane1.addPassenger("Margot Robbie");
         passengerPlane2.addPassenger("Emma Thompson");
//
//        System.out.println(passengerPlane1.toString());
//        System.out.println(passengerPlane2.toString());

        //Q3

        // write calls to methods implemented for Q3.
        System.out.println("\nQ3");
        mgr.add(cargoPlane1);
        mgr.add(cargoPlane2);
        mgr.add(passengerPlane1);
        mgr.add(passengerPlane2);

        System.out.println("display all");
        mgr.displayAllAirplanes();

        System.out.println("\n display passenger planes");

        mgr.displayAllPassengerAirplanes();


        System.out.println("Q3.7");

        boolean check = mgr.containsAirplane(passengerPlane1);

        if (check){
            System.out.println("plane found");
        }else {
            System.out.println("plane found");
        }


        //Question 4
        // Uncomment all the code below and implement the two methods
        // in the CityDistanceManager class.




//        CityDistanceManager cityDistanceManager = new CityDistanceManager();
//        cityDistanceManager.printCitiesData();
//
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("\nPlease enter first city name:");
//        String city1 = keyboard.nextLine();
//        System.out.print("Please enter second city name:");
//        String city2 = keyboard.nextLine();
//
//        int distance = cityDistanceManager.findDistanceBetween(city1, city2);
//        System.out.println("Distance between " + city1 + " and " + city2 + " = " + distance);
//
//        System.out.print("\nEnter base city name:");
//        String baseCity = keyboard.nextLine();
//
//        String closestCity = cityDistanceManager.findClosestCityTo(baseCity);
//        System.out.println("Closest city to " + baseCity+" = " + closestCity);

    }
}
