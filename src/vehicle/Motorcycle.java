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
    
    public Motorcycle(float speed, float direction, int numWheels, int numPassengers, String make, String type) {
        super(speed, direction, make, type, numPassengers);
        this.numWheels = numWheels;
    }
    
    @Override
    public void accelerate(float speed) {
        System.out.println("Accelerating the motorcycle.");
    }
    
    @Override
    public void brake() {
        System.out.println("The motorcycle is starting to decelerate.");
    }
    
    @Override
    public void turn(float angle) {
        System.out.println("Turn to the left.");
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
