/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author Ari
 */
public class Boat extends Vehicle implements Sailable{
    private int numSails = 2;
    private int numPassengers = 3;
    
    public Boat(float speed, float direction, int numSails, int numPassengers, String make, String type) {
        super(speed, direction, make, type, numPassengers);
        this.numSails = numSails;
        this.numPassengers = numPassengers;
    }
    
    @Override
    public void hoistSail() {
    }
    
    @Override
    public void lowerSail() {
    }
    
    @Override
    public void landHo() {
    }
    
    @Override
    public boolean isSailHoisted() {
        return true;
    }
}
