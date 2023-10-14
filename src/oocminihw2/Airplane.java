/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Ari
 */
public class Airplane extends Vehicle implements Flyable{
    private int numWings = 2;
    private int numPassengers = 15;
    
    public Airplane(float speed, float direction, int numWings, int numPassengers, String make, String type) {
        super(speed, direction, make, type, numPassengers);
        this.numWings = numWings;
        this.numPassengers = numPassengers;
    }
    
    @Override
    public void changeAltitude(float change) {
    }
    
    @Override
    public float getAltitude() {
        return 5.486f;
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
    public float getDirection() {
        return 1.479f;
    }
    
    @Override
    public float getSpeed() {
        return 3.128f;
    }
    
    @Override
    public String getMake() {
        return "DHL";
    }
    
    @Override
    public String getType() {
        return "Commercial";
    }
}
