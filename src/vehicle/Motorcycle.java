/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author Ari
 */
public class Motorcycle extends Vehicle implements Drivable{
    private int numWheels;
    
    public Motorcycle(double speed, int numWheels, int numPassengers, String make, String type) {
        super(speed, make, type, numPassengers);
        this.numWheels = 2;
    }
    
    @Override
    public void brake() {
        this.setSpeed(0);
    }
    
    @Override
    public void turn(double angle) {
        this.setDirection(this.getDirection() + angle);
    }
    
    @Override
    public void accelerate(double speedChange) {
        this.setSpeed(this.getSpeed() + speedChange);
    }
}
