/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author Ari
 */
public class Car extends Vehicle implements Drivable{
    private int numWheels;
    
    public Car(double speed, int numWheels, int numPassengers, String make, String type) {
        super(speed, make, type, numPassengers);
        this.numWheels = 4;
    }
    
    @Override
    public void turn(double angle) {
//        float currentDirection = this.getDirection();
        this.setDirection(this.getDirection() + angle);
    }
    @Override
    public void brake() {
        this.setSpeed(0);
    }
    
    @Override
    public void accelerate(double speedChange) {
        this.setSpeed(this.getSpeed() + speedChange);
    }
}
