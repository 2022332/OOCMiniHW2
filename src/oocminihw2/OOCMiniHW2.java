/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

import vehicle.Airplane;
import vehicle.Boat;
import vehicle.Car;
import vehicle.Motorcycle;

/**
 *
 * @author sweiss and Ari
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creating the different types of objects (vehicles) from each class
        Boat myBoat = new Boat(1, true, 3.5,  "Sea Rake", "sailboat", 3);
        Airplane myAirplane = new Airplane( 2.8, 9.4, 15, "DHL", "commercial");
        Motorcycle myMotorcycle = new Motorcycle(11.2, 2, 1, "Harley-Davidson", "cruiser");
        Car myCar = new Car( 10.7, 4, 5,"Chevrolet", "Camaro");
        
        //Caling the different methods and attributes of each object
        //This is the part for the Boat object
        System.out.println("My boat is a " + myBoat.getMake() + " " + myBoat.getType() + ". It has " + myBoat.getNumPassengers() + " passengers.");
        System.out.println("It's also going in a speed of " + myBoat.getSpeed() + " in a direction of " + myBoat.getDirection() + " to the east.");
        
        //This is the part for the Airplane object
        System.out.println("My airplane is a " + myAirplane.getMake() + " " + myAirplane.getType() + ". It has " + myAirplane.getNumPassengers() + " passengers.");
        System.out.println("It's also going in a speed of " + myAirplane.getSpeed() + " in a direction of " + myAirplane.getDirection() + " to the northwest.");
        
        //This is the part for the Motorcycle object
        System.out.println("My motorcycle is a " + myMotorcycle.getMake() + " " + myMotorcycle.getType() + ". It has " + myMotorcycle.getNumPassengers() + " passengers.");
        System.out.println("It's also going in a speed of " + myMotorcycle.getSpeed() + " in a direction of " + myMotorcycle.getDirection() + " to the south.");
        
        //This is the part for the Car object 
        System.out.println("My car is a " + myCar.getMake() + " " + myCar.getType() + ". It has " + myCar.getNumPassengers() + " passengers.");
        System.out.println("It's also going in a speed of " + myCar.getSpeed() + " in a direction of " + myCar.getDirection() + " to the southeast.");
    }
}
