/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author sweiss and Ari
 */
public abstract class Vehicle {
    private float speed;
    private float direction = 0;
    private String make;
    private String type;
    protected int numWheels = 0;
    protected int numWings = 0;
    protected int numSails = 0;
    private int numPassengers;
    
    public Vehicle(float speed, float direction, String make, String type, int numPassengers) {
        this.speed = speed;
        this.direction = direction;
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
    }
    
    public float speed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
    
    public float direction() {
        return direction;
    }
    
    public void setDirection(float direction) {
        this.direction = direction;
    }
    
    public String make() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String type() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public int numPassengers() {
        return numPassengers;
    }
    
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
}
