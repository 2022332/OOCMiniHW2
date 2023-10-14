/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Ari
 */
public class Car extends Vehicle{
    private int numWheels = 4;
    private int numPassengers = 5;
    
    public Car(float speed, float direction, int numWheels, int numPassengers, String make, String type) {
        super(speed, direction, make, type, numPassengers);
        this.numWheels = numWheels;
        this.numPassengers = numPassengers;
    }
}
