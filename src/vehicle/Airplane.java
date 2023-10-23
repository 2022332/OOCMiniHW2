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
    private double altitude;
    
    public Airplane(double altitude, double speed, int numPassengers, String make, String type) {
        super(0, make, type, numPassengers);
        this.altitude = altitude;
    }
    
    @Override
    public void changeAltitude(double altitudeChange) {
        altitude = altitude + altitudeChange;
    }
    
    @Override
    public double getAltitude() {
        return altitude;
    }
    
    @Override
    public void accelerate(double speedChange) {
        this.setSpeed(this.getSpeed() + speedChange);
    }
    
    @Override
    public void brake() {
        this.setSpeed(0);
    }
    
    @Override
    public void turn(double angle) {
        this.setDirection(this.getDirection() + angle);
    }
}
