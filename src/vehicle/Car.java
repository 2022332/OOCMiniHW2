/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author Ari
 */
public class Car extends Vehicle{
    private int numWheels;
    
    public Car(float speed, float direction, int numWheels, int numPassengers, String make, String type) {
        super(speed, direction, make, type, numPassengers);
        this.numWheels = numWheels;
    }
}
