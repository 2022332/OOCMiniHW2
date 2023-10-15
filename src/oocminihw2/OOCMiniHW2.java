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
        Boat myBoat = new Boat(2.583f, 4.152f, 1, 3, "Sea Rake", "sailboat");
        Airplane myAirplane = new Airplane(3.128f, 1.479f, 2, 15, "DHL", "commercial");
        Motorcycle myMotorcycle = new Motorcycle(9.459f, 3.324f, 2, 1, "Harley-Davidson", "cruiser");
        Car myCar = new Car(7.521f, 1.547f, 4, 5,"Chevrolet", "Camaro");
        
        //Caling the different methods and attributes of each object
        //This is the part for the Boat object
        System.out.println("My boat is a " + myBoat.make() + " " + myBoat.type() + ". It has " + myBoat.numPassengers() + " passengers.");
        System.out.println("It's also going in a speed of " + myBoat.speed() + " in a direction of " + myBoat.direction() + " to the east.");
        boolean isSailHoisted = myBoat.isSailHoisted();
        System.out.println("Remeber to hoist the sail! " + isSailHoisted);
        myBoat.hoistSail();
        myBoat.landHo();
        myBoat.lowerSail();
        
        //This is the part for the Airplane object
        System.out.println("My airplane is a " + myAirplane.getMake() + " " + myAirplane.getType() + ". It has " + myAirplane.numPassengers() + " passengers.");
        System.out.println("It's also going in a speed of " + myAirplane.getSpeed() + " in a direction of " + myAirplane.getDirection() + " to the northwest.");
        myAirplane.getAltitude();
        myAirplane.accelerate(1.654f);
        myAirplane.changeAltitude(7.951f);
        myAirplane.turn(1.321f);
        myAirplane.brake();
        
        //This is the part for the Motorcycle object
        System.out.println("My motorcycle is a " + myMotorcycle.getMake() + " " + myMotorcycle.getType() + ". It has " + myMotorcycle.numPassengers() + " passengers.");
        System.out.println("It's also going in a speed of " + myMotorcycle.getSpeed() + " in a direction of " + myMotorcycle.getDirection() + " to the south.");
        myMotorcycle.turn(9.753f);
        myMotorcycle.accelerate(4.258f);
        myMotorcycle.brake();
        
        //This is the part for the Car object 
        System.out.println("My car is a " + myCar.make() + " " + myCar.type() + ". It has " + myCar.numPassengers() + " passengers.");
        System.out.println("It's also going in a speed of " + myCar.speed() + " in a direction of " + myCar.direction() + " to the southeast.");
    }
}
