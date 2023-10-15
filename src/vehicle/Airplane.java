/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author Ari
 */
public class Airplane extends Vehicle implements Flyable{
    private int numWings;
    
    public Airplane(float speed, float direction, int numWings, int numPassengers, String make, String type) {
        super(speed, direction, make, type, numPassengers);
        this.numWings = numWings;
    }
    
    @Override
    public void changeAltitude(float change) {
        System.out.println("Changing altitude.");
    }
    
    @Override
    public float getAltitude() {
        return 5.486f;
    }
    
    @Override
    public void accelerate(float speed) {
        System.out.println("Accelerating the airplane.");
    }
    
    @Override
    public void brake() {
        System.out.println("The airplane is preparing for landing.");
    }
    
    @Override
    public void turn(float angle) {
        System.out.println("Turning to the right .");
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
