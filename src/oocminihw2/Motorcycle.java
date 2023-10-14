/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Ari
 */
public class Motorcycle extends Vehicle implements Drivable{
    private int numWheels = 2;
    private int numPassengers = 1;
    
    public Motorcycle(float speed, float direction, int numWheels, int numPassengers, String make, String type) {
        super(speed, direction, make, type, numPassengers);
        this.numWheels = numWheels;
        this.numPassengers = numPassengers;
    }
    
    @Override
    public void accelerate(float speed) {
    }
    
    @Override
    public void brake() {
    }
    
    @Override
    public void turn(float angle) {
    }
    
    @Override
    public float getDirection(){
        return 3.324f;
    }
    
    @Override
    public float getSpeed(){
        return 9.459f;
    }
    
    @Override
    public String getMake(){
        return "Harley-Davidson";
    }
    
    @Override
    public String getType(){
        return "Cruiser";
    }
}
