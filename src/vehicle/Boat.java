/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author Ari
 */
public class Boat extends Vehicle implements Sailable{
    private int numSails;
    
    public Boat(float speed, float direction, int numSails, int numPassengers, String make, String type) {
        super(speed, direction, make, type, numPassengers);
        this.numSails = numSails;
    }
    
    @Override
    public void hoistSail() {
        System.out.println("The sail is been hoist to get more speed from the wind.");
    }
    
    @Override
    public void lowerSail() {
        System.out.println("The sail is been lowered to stop the boat.");
    }
    
    @Override
    public void landHo() {
        System.out.println("Land has been spotted!");
    }
    
    @Override
    public boolean isSailHoisted() {
        return true;
    }
}
